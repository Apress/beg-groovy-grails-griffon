application {
    title = 'User'
    startupGroups = ['user']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "user"
    'user' {
        model      = 'user.UserModel'
        view       = 'user.UserView'
        controller = 'user.UserController'
    }

}
