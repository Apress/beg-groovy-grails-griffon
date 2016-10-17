
 class A{
 def list= []
 A(){
 list<< "A constructed"
 }
 A(int i){
 this()
 list<< "A constructed with $i"
 }
 }
 class B extends A{
 B(){
 list<< "B constructed"
 }
 B(String s){
 super(5)
 list<< "B constructed with '$s'"
 }
 }
 def b1= new B('test')
 assert b1.list.collect{it} == [
 "A constructed",
 "A constructed with 5",
 "B constructed with 'test'",
 ]
 def b2= new B()
 assert b2.list == [
 "A constructed",
 "B constructed",
 ]
