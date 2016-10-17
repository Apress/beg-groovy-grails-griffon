package collab.todo

class LogoutController {

    def logout() {
        log.info 'logout'
        if(session.user) {
			session.user = null
			session.invalidate()
			redirect(controller:'login')
		}
	}
}