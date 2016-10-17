
<%@ page import="collab.todo.Todo" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'todo.label', default: 'Todo')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-todo" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-todo" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list todo">
			
				<g:if test="${todoInstance?.owner}">
				<li class="fieldcontain">
					<span id="owner-label" class="property-label"><g:message code="todo.owner.label" default="Owner" /></span>
					
						<span class="property-value" aria-labelledby="owner-label"><g:link controller="user" action="show" id="${todoInstance?.owner?.id}">${todoInstance?.owner?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${todoInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="todo.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${todoInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${todoInstance?.createdDate}">
				<li class="fieldcontain">
					<span id="createdDate-label" class="property-label"><g:message code="todo.createdDate.label" default="Created Date" /></span>
					
						<span class="property-value" aria-labelledby="createdDate-label"><g:formatDate date="${todoInstance?.createdDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${todoInstance?.dueDate}">
				<li class="fieldcontain">
					<span id="dueDate-label" class="property-label"><g:message code="todo.dueDate.label" default="Due Date" /></span>
					
						<span class="property-value" aria-labelledby="dueDate-label"><g:formatDate date="${todoInstance?.dueDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${todoInstance?.priority}">
				<li class="fieldcontain">
					<span id="priority-label" class="property-label"><g:message code="todo.priority.label" default="Priority" /></span>
					
						<span class="property-value" aria-labelledby="priority-label"><g:fieldValue bean="${todoInstance}" field="priority"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${todoInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="todo.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:fieldValue bean="${todoInstance}" field="status"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${todoInstance?.completedDate}">
				<li class="fieldcontain">
					<span id="completedDate-label" class="property-label"><g:message code="todo.completedDate.label" default="Completed Date" /></span>
					
						<span class="property-value" aria-labelledby="completedDate-label"><g:formatDate date="${todoInstance?.completedDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${todoInstance?.note}">
				<li class="fieldcontain">
					<span id="note-label" class="property-label"><g:message code="todo.note.label" default="Note" /></span>
					
						<span class="property-value" aria-labelledby="note-label"><g:fieldValue bean="${todoInstance}" field="note"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${todoInstance?.category}">
				<li class="fieldcontain">
					<span id="category-label" class="property-label"><g:message code="todo.category.label" default="Category" /></span>
					
						<span class="property-value" aria-labelledby="category-label"><g:link controller="category" action="show" id="${todoInstance?.category?.id}">${todoInstance?.category?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${todoInstance?.id}" />
					<g:link class="edit" action="edit" id="${todoInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
