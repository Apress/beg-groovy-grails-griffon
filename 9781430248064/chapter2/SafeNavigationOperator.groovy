class User {
String firstName
String lastName
def printFullName = {
println "${firstName} ${lastName}"
}
}
User user
println "Groovy FirstName = ${user?.firstName}"