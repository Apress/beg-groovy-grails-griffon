 def writer = new StringWriter()
 def builder = new groovy.xml.MarkupBuilder(writer)
 builder.setDoubleQuotes(true)
 builder.todos {
 todo (id:"1") {
 name "Buy Beginning Groovy and Grails"
 note "Purchase book from Amazon.com for all co-workers."
 }
 }

 println writer.toString()
