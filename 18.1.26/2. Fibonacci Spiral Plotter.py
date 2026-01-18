import matplotlib.pyplot as plt
import numpy as np

n = 15
fib = [0,1]
for i in range(2,n):
    fib.append(fib[-1]+fib[-2])

theta = np.linspace(0, 4*np.pi, n)
r = fib
plt.polar(theta, r, marker="o")
plt.show()
