
 class Test{
 def i = 0
 def j = 0
 }
 def test1 = new Test(i:1, j:2)
 assert test1.i == 1
 assert test1.j == 2