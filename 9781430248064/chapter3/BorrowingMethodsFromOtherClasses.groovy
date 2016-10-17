 class Author{
 String name
 }
 class Greet{
 def sayHello() {
 "hello vishal"
 }
 }
 def hello = new Greet()
 Author.metaClass.greet = hello.&sayHello
 def author = new Author()
 assert author.greet() == "hello vishal"
