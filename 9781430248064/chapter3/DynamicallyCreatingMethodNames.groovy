 class Test{
 String name = "foo"
 }
 def newName = "bar"
 Test.metaClass."changeNameTo${newName}" = {-> delegate.name = "bar" }
 def m = new Test()
 assert m.name == "foo"
 m.changeNameTobar()
 assert m.name == "bar"
