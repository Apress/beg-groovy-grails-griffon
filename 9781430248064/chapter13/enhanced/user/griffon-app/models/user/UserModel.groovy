
package user
import groovy.beans.Bindable
import griffon.transform.PropertyListener
@PropertyListener(clos)
class UserModel {
    @Bindable String username
    @Bindable String password
    @Bindable boolean enabled    
	private clos = { evt ->
        if(evt.propertyName == 'enabled') return
        login = username && password
    }
}