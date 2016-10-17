

interface X{
def x()

}
interface Y{
def y()
 }
abstract class A{
static a(){ println 1 }
abstract b()
abstract c()
 }
 class B extends A implements X, Y{
 static x(){ println 2 }
 def y(){ println 3 }
 static b(){ println 4 }
 def c(){ println 5 }
 }
def b = new B()
b.a()
B.a()
B.x()
b.y()
B.b()
b.b()
b.c()
