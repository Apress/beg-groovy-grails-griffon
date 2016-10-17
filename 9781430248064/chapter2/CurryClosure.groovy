def add= { x, y -> return x + y }
def newAdd = add.curry(1)
assert newAdd(2) == 3