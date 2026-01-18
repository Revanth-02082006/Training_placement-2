def spiral(n):
    mat = [[0]*n for _ in range(n)]
    dx,dy,x,y=0,1,0,0
    for i in range(1,n*n+1):
        mat[x][y]=i
        if not(0<=x+dx<n and 0<=y+dy<n and mat[x+dx][y+dy]==0):
            dx,dy=dy,-dx
        x,y=x+dx,y+dy
    for row in mat: print(row)

spiral(5)
