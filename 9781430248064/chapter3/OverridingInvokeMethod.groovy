 class Item{
 int itemNumber
 String itemName
 int qty
 Object invokeMethod(String name, Object args) {
 if (name == "test"){
 this.properties.each {
 println " " + it.key + ": " + it.value
 }
 }
 }
 }
 def item1 = new Item(itemNumber: 1, itemName:"Item 1", qty:100)
 def item2= new Item(itemNumber:2, itemName:"Item 2", qty:200)
 def itemList = [ item1, item2]
 itemList.each { it.test()}
