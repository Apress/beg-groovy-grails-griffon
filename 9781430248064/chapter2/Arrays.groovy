 def stringArray = new String[3]
 println stringArray.size()
 stringArray[0] = "Chris"
 println stringArray // {"Chris", null, null}
 stringArray[1] = "Joseph"
 stringArray[2] = "Jim"
 println stringArray // {"Chris", "Joseph", "Jim"}
 println stringArray[1] // Joseph
 stringArray.each { println it} // Chris, Joseph, Jim
 println stringArray[-1..-3] // ["Jim", "Joseph", "Chris"]