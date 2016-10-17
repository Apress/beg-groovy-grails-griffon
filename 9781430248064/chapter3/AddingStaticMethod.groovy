 class Book {
 String title
 }
 Book.metaClass.static.create << { String title -> new Book(title:title) }
 def b = Book.create("Beginning Groovy, Grails and Griffon")
 assert "Beginning Groovy, Grails and Griffon" == b.title
