class Todo {
String name
def getName() {
println "Getting Name"
name
}
}
def todo = new Todo(name: "Jim")
println todo.name
println todo.@name