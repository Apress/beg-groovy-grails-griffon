

class SecurityFilters {

    // needs to ignore rest and soap
    // ignore /rest/ and /soap/

    // location for the filters
    def filters = {
        collabTodoFilter(controller:'*', action:'*') {
            before = {

                if(!session.user
                    && !controllerName.equals('login')
                    && !controllerName.equals('captcha')
                    && ( !controllerName.equals('user') && !actionName.equals("register"))
                    ) {
                    // is there no log access in the filter?
                    //log.info('Redirect to login page')
                    redirect(controller:'login')
                    return false
               }
           }
        }
   }
}