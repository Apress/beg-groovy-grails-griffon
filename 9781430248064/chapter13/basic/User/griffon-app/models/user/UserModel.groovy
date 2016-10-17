package user

import groovy.beans.Bindable
import griffon.transform.PropertyListener
import static griffon.util.GriffonNameUtils.isBlank

@Bindable
@PropertyListener(enabler)
class UserModel {
  
	String firstName
	String lastName
	boolean create
	

private enabler = { e ->
create = !isBlank(firstName) &&
!isBlank(lastName) 
}
}