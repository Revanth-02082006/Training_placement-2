import numpy as np
g=np.random.randint(2,size=(5,5))
for _ in range(5):
    print(g)
    n=sum(np.roll(np.roll(g,i,0),j,1) for i in(-1,0,1) for j in(-1,0,1)) - g
    g=(n==3)|(g&(n==2))
