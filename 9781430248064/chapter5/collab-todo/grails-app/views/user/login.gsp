 <html>
 <head>
 <title>Login Page</title>
 <meta name="layout" content="main" />
 </head>
 <body>
 <div class="body">
 <g:if test="${flash.message}">
 <div class="message">
 ${flash.message}
 </div>
 </g:if>
 <p>
 Welcome to Your ToDo List. Login below
 </p>
 <form action="handleLogin">

 <span class='nameClear'><label for="login">
 Sign In:
 </label>
 </span>
 <g:textField name="userName" value="${user?.userName}" />

 <br />
 <div class="buttons">
 <span class="button">
 <g:actionSubmit value="Login" action="handleLogin"/>
 </span>
 </div>
 </form>
 </div>
 </body>
 </html>