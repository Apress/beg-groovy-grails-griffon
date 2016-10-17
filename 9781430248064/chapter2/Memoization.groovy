closure = {param1, param2 -> sleep(100); param1 + param2 }

memoizedClosure = closure.memoize()

def testTime(param1, param2) { begin = 		System.currentTimeMillis()
		memoizedClosure(param1, param2)
		timeElapsed = System.currentTimeMillis()
		println "param1 = $param1, param2 = $param2 time :${timeElapsed - begin } ms."
    	}

testTime(1, 2)
testTime(3, 4)
testTime(1, 2)