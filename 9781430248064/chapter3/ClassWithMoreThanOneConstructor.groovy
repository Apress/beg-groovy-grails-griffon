
class A{
def list= []
A(){
list<< "A constructed"
}
A(int i){
this()
list<< "A constructed with $i"
}
A(String s){
this(5)
list<< "A constructed with '$s'"
}
}
def a1= new A()
assert a1.list == [ "A constructed" ]
def a2= new A(7)
assert a2.list.collect{it} == [
"A constructed",
"A constructed with 7",
 ]
def a3= new A('test')
assert a3.list.collect{it} == [
"A constructed",
"A constructed with 5",
"A constructed with 'test'",
 ]
