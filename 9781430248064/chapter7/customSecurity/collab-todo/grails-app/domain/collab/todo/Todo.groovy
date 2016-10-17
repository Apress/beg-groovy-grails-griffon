package collab.todo

/**
 * This is the To Do's Domain object.
 * This object will contain all the To Do's for the application.
 * Chapter 5
 *
 */
class Todo {

    static belongsTo = [User, Category]

	User owner
	Category category
    String name
    String note
    Date createDate
	Date startDate  
    Date dueDate
    Date completeDate
    Date lastModifiedDate
    Priorities priority
    Statuses status
     
    static constraints = {
        category(nullable:true)
        dueDate(nullable:true)
        owner(nullable:false)
    	name(blank:false)
		createDate(blank:false)
                priority(blank:false)
		//priority(inList:['Low', 'Medium', 'High'])
		//status(inList:['Complete', 'Incomplete'])
		note(maxSize:1000)
		// necessary or it will default hte nullable to false on MySQL
		completeDate(nullable:true,
			validator: {
                            // val is this value, obj is the Todo object
                            val, obj ->
                                    if (val != null) {
                                            return val.after(obj.createDate)
                                    }
                                    return true
			})
		startDate(nullable:true )

    }
    
    String toString() {
    	return "Name: ${name}, note: ${note}"
    }
	             
	String dump() {
		return "Owner: ${owner}, Name: ${name}, Note: ${note}, Create Date: ${createDate}, Due Date: ${dueDate}, Complete Date: ${completeDate}, Priority: ${priority}, Status: ${status}"
	}

   
}	

enum Priorities {Low, Medium, High }
enum Statuses {Incomplete, Complete}

