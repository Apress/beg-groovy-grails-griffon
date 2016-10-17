def multiplier = new Expando()
multiplier.value = 5
multiplier.doubleIt = { -> multiplier.value = multiplier.value* 2}
multiplier.doubleIt()
assert multiplier.value == 10
