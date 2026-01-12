import random
n=10000
c=sum((random.random()**2+random.random()**2)<1 for _ in range(n))
print(4*c/n)
