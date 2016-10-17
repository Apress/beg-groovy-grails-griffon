 def emptyList = []
 println emptyList.class.name // java.util.ArrayList
 println emptyList.size // 0

 def list = ["Chris"] // List with one item in it
 // Add items to the list
 list.add "Joseph" // Notice the optional () missing
 list << "Jim" // Notice the overloaded left-shift operator
 println list.size // 3

 // Iterate over the list
 list.each { println it } // Chris Joseph Jim

 // Access items in the list
 println list[1] // Joseph // Indexed access
 list[0] = "Christopher"
 println list.get(0) // Christopher

 list.set(0, "Chris") // Set the 0 item to Chris
 println list.get(0) // Chris

 list.remove 2
 list-= "Joseph" // Overloaded - operator
 list.each { println it } // Chris

 list.add "Joseph"
 list+="Jim" // Overloaded + operator
 list.each { println it } // Chris Joseph Jim
 println list[-1] // Jim