 class Square{
 def display() {
 assert "length:${length} width:${width}" == "length:10 width:10"
 }
 def length
 def width
 }
 class Rectangle{
 def display() {
 assert "length:${length} width:${width}" == "length:10 width:12"
 }
 def length
 def width
 }
 def shapes= [new Square(length : 10, width : 10),
 new Rectangle(length : 10, width : 12)
 ]
 shapes.each { item -> item.display() }
