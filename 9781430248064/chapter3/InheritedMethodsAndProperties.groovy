class A{
int x
int y
String methodA(int n){ "value ${x= y= n}" }
 }
class B extends A{
String methodB(int n){ "value $n" }
 }
 def b= new B()
 assert b.methodB(10) == 'value 10'
 assert b.methodA(20) == 'value 20'
 assert b.x == 20
 assert b.y == 20
 b.y= 5
 assert b.y == 5
 assert b.getY() == 5
