<%@ page import="collab.todo.Category" %>



<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="category.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${categoryInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="category.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${categoryInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'todos', 'error')} ">
	<label for="todos">
		<g:message code="category.todos.label" default="Todos" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${categoryInstance?.todos?}" var="t">
    <li><g:link controller="todo" action="show" id="${t.id}">${t?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="todo" action="create" params="['category.id': categoryInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'todo.label', default: 'Todo')])}</g:link>
</li>
</ul>

</div>

<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'user', 'error')} required">
	<label for="user">
		<g:message code="category.user.label" default="User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="user" name="user.id" from="${collab.todo.User.list()}" optionKey="id" required="" value="${categoryInstance?.user?.id}" class="many-to-one"/>
</div>

