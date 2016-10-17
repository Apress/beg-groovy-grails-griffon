
class A{}
class B extends A{}
def b = new B()
assert b in B && b in A
