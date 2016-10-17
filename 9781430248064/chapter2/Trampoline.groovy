def factorial

factorial={n, BigInteger acc=1->

n == 1 ? acc:
factorial.trampoline(n-1, n*acc)
}.trampoline()

factorial(1000)