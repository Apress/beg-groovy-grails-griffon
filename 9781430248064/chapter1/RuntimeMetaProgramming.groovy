String.metaClass.firstUpper = {->
return delegate[0].toUpperCase() + delegate[1..delegate.length() - 1]
}
println "iiii".firstUpper()