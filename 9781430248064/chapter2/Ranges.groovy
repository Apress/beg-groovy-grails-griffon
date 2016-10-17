 def numRange = 0..9
 println numRange.size() // 10
 numRange.each {print it} // 0123456789
 println ""
 println numRange.contains(5) // true

def alphaRange = 'a'..'z'
 println alphaRange.size() // 26
 println alphaRange[1] // b

 def exclusiveRange = 1..<10
 println exclusiveRange.size() // 9
 exclusiveRange.each {print it} // 123456789
 println ""
 println exclusiveRange.contains(10) // false

 def reverseRange = 9..0
 reverseRange.each {print it} // 9876543210