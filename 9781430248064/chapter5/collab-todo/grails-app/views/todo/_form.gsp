<%@ page import="collab.todo.Todo" %>



<div class="fieldcontain ${hasErrors(bean: todoInstance, field: 'owner', 'error')} required">
	<label for="owner">
		<g:message code="todo.owner.label" default="Owner" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="owner" name="owner.id" from="${collab.todo.User.list()}" optionKey="id" required="" value="${todoInstance?.owner?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: todoInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="todo.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${todoInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: todoInstance, field: 'createdDate', 'error')} required">
	<label for="createdDate">
		<g:message code="todo.createdDate.label" default="Created Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="createdDate" precision="day"  value="${todoInstance?.createdDate}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: todoInstance, field: 'dueDate', 'error')} ">
	<label for="dueDate">
		<g:message code="todo.dueDate.label" default="Due Date" />
		
	</label>
	<g:datePicker name="dueDate" precision="day"  value="${todoInstance?.dueDate}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: todoInstance, field: 'priority', 'error')} ">
	<label for="priority">
		<g:message code="todo.priority.label" default="Priority" />
		
	</label>
	<g:textField name="priority" value="${todoInstance?.priority}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: todoInstance, field: 'status', 'error')} ">
	<label for="status">
		<g:message code="todo.status.label" default="Status" />
		
	</label>
	<g:textField name="status" value="${todoInstance?.status}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: todoInstance, field: 'completedDate', 'error')} ">
	<label for="completedDate">
		<g:message code="todo.completedDate.label" default="Completed Date" />
		
	</label>
	<g:datePicker name="completedDate" precision="day"  value="${todoInstance?.completedDate}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: todoInstance, field: 'note', 'error')} ">
	<label for="note">
		<g:message code="todo.note.label" default="Note" />
		
	</label>
	<g:textArea name="note" cols="40" rows="5" maxlength="1000" value="${todoInstance?.note}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: todoInstance, field: 'category', 'error')} required">
	<label for="category">
		<g:message code="todo.category.label" default="Category" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="category" name="category.id" from="${collab.todo.Category.list()}" optionKey="id" required="" value="${todoInstance?.category?.id}" class="many-to-one"/>
</div>

