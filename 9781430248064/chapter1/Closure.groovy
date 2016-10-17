def name = "Chris"
def printClosure = { println "Hello, ${name}" }
printClosure()
name = "Joseph"
printClosure()