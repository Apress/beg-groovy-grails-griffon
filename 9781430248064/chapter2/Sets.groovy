 def emptySet = [] as Set
 println emptySet.class.name // java.util.HashSet
 println emptySet.size() // 0

 def list = ["Chris", "Chris" ]
 def set = ["Chris", "Chris" ] as Set
 println "List Size: ${list.size()} Set Size: ${set.size()}" // List Size: 2 Set
Size: 1
 set.add "Joseph"
 set << "Jim"
 println set.size() // 3
 println set // ["Chris", "Jim", "Joseph"]

 // Iterate over the set
 set.each { println it }

 set.remove 2
 set-= "Joseph" // Overloaded - operator
 set.each { println it } // Chris
 set+= "Joseph"
 set+= "Jim"
 set.each { println it } // Chris Joseph Jim

 // Convert a set to a list
 list = set as List
 println list.class.name // java.util.ArrayList
 println set.asList().class.name // java.util.ArrayList
 println set.toList().class.name // java.util.ArrayList