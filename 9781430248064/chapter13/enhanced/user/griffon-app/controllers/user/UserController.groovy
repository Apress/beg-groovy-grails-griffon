package user

import javax.swing.JOptionPane
class UserController {
    def login = {
        JOptionPane.showMessageDialog(app.windowManager.windows[0],
            """
               username = $model.username
               password = $model.password
            """.stripIndent(14).toString())
    }
}

