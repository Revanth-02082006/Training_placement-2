import random
x=y=0
for _ in range(20):
    dx,dy=random.choice([(1,0),(-1,0),(0,1),(0,-1)])
    x+=dx;y+=dy
    print(x,y)
