key1 = { println "closure as key" }
map1 = [ (key1): 100 ]

println map1.get(key1)
println map1[key1]

map1 = [ key1: { println "closure as value" } ]
map1.key1()