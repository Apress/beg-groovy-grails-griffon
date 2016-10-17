
interface X{
def x()
}
interface Y{
def y()
}

abstract class A{
	def a(){ println 1 }
	abstract b()
 	}
 
class B extends A implements X, Y{
 def x(){ println 2 }
 def y(){ println 3 }
 def b(){ println 4 }
 }

def b = new B()
b.a()
b.x()
b.y()
b.b()