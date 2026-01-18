import random
import matplotlib.pyplot as plt

x=y=0
X=[x];Y=[y]
for _ in range(100):
    dx,dy=random.choice([(1,0),(-1,0),(0,1),(0,-1)])
    x+=dx;y+=dy
    X.append(x);Y.append(y)

plt.plot(X,Y)
plt.show()
