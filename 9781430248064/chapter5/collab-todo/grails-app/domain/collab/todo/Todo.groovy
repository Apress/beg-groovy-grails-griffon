package collab.todo

class Todo {

    static belongsTo = [User, Category]

	User owner
    String name
    String note
    Date createdDate
    Date dueDate
    Date completedDate
    String priority
    String status
    Category category

    static constraints = {
		owner(nullable:false)
    	name(blank:false)
		createdDate(blank:false)
		dueDate(nullable:true)
		priority()
		status()
		completedDate(nullable:true)
		note(maxSize:1000, nullable:true)
	}

    String toString() {
    	return "${owner?.userName} - $name"
    }
}
