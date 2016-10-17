def list = ["Vishal","Chris","Joseph","Jim"]
list.each { println it }
String printName(String name) {
println name
}
list.each(this.&printName)