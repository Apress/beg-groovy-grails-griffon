package collab.todo

class User {

	String firstName
	String lastName
	String userName
	String password
	String email
	String confirm

	static constraints = {
		userName(blank:false,unique:true)
		password(blank:false, minLength:3)

		email(email:true)
		firstName(blank:false)
		lastName(blank:false)
	}

	String  toString () {
		return "$lastName, $firstName"
	}

	String dump() {
		return "FirstName: ${firstName}, LastName: ${lastName}, UserName: ${userName},Password: ${password},  Email: ${email}"
	}



}
