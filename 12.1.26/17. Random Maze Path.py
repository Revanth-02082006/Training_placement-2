import random
path=[(0,0)]
for _ in range(10):
    x,y=path[-1]
    dx,dy=random.choice([(1,0),(-1,0),(0,1),(0,-1)])
    path.append((x+dx,y+dy))
print(path)
