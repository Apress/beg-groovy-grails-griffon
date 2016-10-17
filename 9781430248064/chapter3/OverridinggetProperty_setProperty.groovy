 class Expandable {
 def storage = [:]
 def getProperty(String name) { storage[name] }
 void setProperty(String name, value) { storage[name] = value }
 }
 def e = new Expandable()
 e.foo = "bar"
 println e.foo
