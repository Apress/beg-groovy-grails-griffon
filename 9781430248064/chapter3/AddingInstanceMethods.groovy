class Book {
 String title
 }
 Book.metaClass.titleInUpperCase << {-> title.toUpperCase() }
 def b = new Book(title:"Beginning Groovy, Grails and Griffon")
 assert "BEGINNING GROOVY, GRAILS AND GRIFFON" == b.titleInUpperCase()
