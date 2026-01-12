import random
n=10
maze=[["#" for _ in range(n)] for _ in range(n)]
x=y=0
maze[x][y]=" "
for _ in range(100):
    dx,dy=random.choice([(1,0),(-1,0),(0,1),(0,-1)])
    x=max(0,min(n-1,x+dx))
    y=max(0,min(n-1,y+dy))
    maze[x][y]=" "
for r in maze:print("".join(r))
