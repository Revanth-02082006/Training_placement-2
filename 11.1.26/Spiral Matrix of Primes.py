import math
n=5
m=[[0]*n for _ in range(n)]
primes=[x for x in range(2,100) if all(x%p for p in range(2,int(math.sqrt(x))+1))]
d=[(0,1),(1,0),(0,-1),(-1,0)]
x=y=di=0
for p in primes[:n*n]:
    m[x][y]=p
    nx,ny=x+d[di][0],y+d[di][1]
    if nx<0 or ny<0 or nx>=n or ny>=n or m[nx][ny]:
        di=(di+1)%4
        nx,ny=x+d[di][0],y+d[di][1]
    x,y=nx,ny
print(m)
