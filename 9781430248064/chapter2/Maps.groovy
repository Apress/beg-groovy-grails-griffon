 def emptyMap = [:]
 // map.class returns null, use getClass()
 println emptyMap.getClass().name //java.util.LinkedHashMap
 println emptyMap.size() // 0

 def todos = ['a':'Write the map section', 'b':'Write the set section']
 println todos.size() // 2
 println todos["a"] // Write the map section
 println todos."a" // Write the map section
 println todos.a // Write the map section
 println todos.getAt("b") // Write the set section
 println todos.get("b") // Write the set section
 println todos.get("c", "unknown") // unknown, Notice "c" wasn't defined
 // and now it is
 println todos // ["a":"Write the map section", "b":"Write the set section",
 // "c":"unknown"]

 todos.d = "Write the ranges section"
 println todos.d // Write the ranges section
 todos.put('e', 'Write the strings section')
 println todos.e // Write the strings section
 todos.putAt 'f', 'Write the closure section' // Notice () are optional
 println todos.f // Write the closure section
 todos[null] = 'Nothing Set' // Using null as a key
 println todos[null] // Nothing set
 // Print each key/value pair on a separate Line
 // Note: it is an implicit iterator
 todos.each { println "Key: ${it.key}, Value: ${it.value}" }
 // Print each key/value pair on a separate Line with index
 todos.eachWithIndex { it, i -> println "${i} Key: ${it.key},Value: ${it.value}" }
 // Print the value set
 todos.values().each { println it }