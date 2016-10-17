 class Class1{
 def closure = {
 println "---in closure---"
 println this.class.name
 println owner.class.name
 println delegate.class.name
 def nestedClosure = {
 println "---in nestedClosure---"
 println this.class.name
 println owner.class.name
 println delegate.class.name
 }
 nestedClosure()
 }
 }

 def clos = new Class1().closure
 clos()
 println ""
 println "===changing the delegate==="
 clos.delegate = this
 clos()
 println ""
 def closure2 = {
 println "--- closure outside the class(in the script)---"
 println this.class.name
 println delegate.class.name
 println owner.class.name

 }

closure2()