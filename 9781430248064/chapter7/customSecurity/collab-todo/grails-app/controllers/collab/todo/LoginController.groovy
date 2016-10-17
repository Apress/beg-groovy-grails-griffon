package collab.todo


import org.apache.commons.codec.digest.DigestUtils as DU

/**
 * This will handle the logging into the application.
 *
 */
class LoginController {

    def index(){
        render(view:'login')
    }

    
    def handleLogin(){
println "Handle Login"
        def hashPassd = DU.md5Hex(params.password)
println params.userName
println params.password

        // find the user name
        def user = User.findByUserNameAndPassword(params.userName, hashPassd)
        
        if (!user) {
                flash.message = "User not found for userName: ${params.userName}"
                redirect(action:'index')
                return
        } else {
            session.user = user
            redirect(controller:'todo')
        }
    }
}