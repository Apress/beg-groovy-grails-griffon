 class Book {
 String title
 }
 Book.metaClass.constructor << { String title -> new Book(title:title) }
 Book.metaClass.getAuthor << {-> "Vishal Layka" }
 def b = new Book("Beginning Groovy, Grails and Griffon")
 assert "Beginning Groovy, Grails and Griffon"== b.title
 assert "Vishal Layka" == b.author
