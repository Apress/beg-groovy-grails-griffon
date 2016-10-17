def list = ["Chris","Joseph","Jim"]
// each takes a closure
list.each { println it }
String printName(String name) {
println name
}
// & causes the method to be accessed as a closure
list.each(this.&printName)