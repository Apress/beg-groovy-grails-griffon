package collab.todo

import org.springframework.dao.DataIntegrityViolationException

class TodoController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [todoInstanceList: Todo.list(params), todoInstanceTotal: Todo.count()]
    }

    def create() {
        [todoInstance: new Todo(params)]
    }

    def save() {
        def todoInstance = new Todo(params)
        if (!todoInstance.save(flush: true)) {
            render(view: "create", model: [todoInstance: todoInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'todo.label', default: 'Todo'), todoInstance.id])
        redirect(action: "show", id: todoInstance.id)
    }

    def show(Long id) {
        def todoInstance = Todo.get(id)
        if (!todoInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'todo.label', default: 'Todo'), id])
            redirect(action: "list")
            return
        }

        [todoInstance: todoInstance]
    }

    def edit(Long id) {
        def todoInstance = Todo.get(id)
        if (!todoInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'todo.label', default: 'Todo'), id])
            redirect(action: "list")
            return
        }

        [todoInstance: todoInstance]
    }

    def update(Long id, Long version) {
        def todoInstance = Todo.get(id)
        if (!todoInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'todo.label', default: 'Todo'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (todoInstance.version > version) {
                todoInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'todo.label', default: 'Todo')] as Object[],
                          "Another user has updated this Todo while you were editing")
                render(view: "edit", model: [todoInstance: todoInstance])
                return
            }
        }

        todoInstance.properties = params

        if (!todoInstance.save(flush: true)) {
            render(view: "edit", model: [todoInstance: todoInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'todo.label', default: 'Todo'), todoInstance.id])
        redirect(action: "show", id: todoInstance.id)
    }

    def delete(Long id) {
        def todoInstance = Todo.get(id)
        if (!todoInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'todo.label', default: 'Todo'), id])
            redirect(action: "list")
            return
        }

        try {
            todoInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'todo.label', default: 'Todo'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'todo.label', default: 'Todo'), id])
            redirect(action: "show", id: id)
        }
    }
}
