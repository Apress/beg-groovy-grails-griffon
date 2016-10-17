 List.metaClass.sizeDoubled = {-> delegate.size() * 2 }
 def list = []
 list << 1
 list << 2
 assert 4 == list.sizeDoubled()
