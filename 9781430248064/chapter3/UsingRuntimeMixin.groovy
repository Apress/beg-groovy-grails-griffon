 class A{
 String genericfeatureNeededByClassB(){}
 }
 class B extends A{
 String getName() { "class B which already extends class A" }
 }
 final class C{
 static test(A self) { "I'm the final class C and reused by ${self.name} !" }
 }
 B.mixin C
 println new B().test()
