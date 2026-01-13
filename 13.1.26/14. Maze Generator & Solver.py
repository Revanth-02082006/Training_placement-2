import random

def maze(n,m):
    grid=[['#']*m for _ in range(n)]
    def carve(x,y):
        dirs=[(2,0),(0,2),(-2,0),(0,-2)]
        random.shuffle(dirs)
        for dx,dy in dirs:
            nx,ny=x+dx,y+dy
            if 0<nx<n and 0<ny<m and grid[nx][ny]=='#':
                grid[nx-dx//2][ny-dy//2]=' '
                grid[nx][ny]=' '
                carve(nx,ny)
    grid[1][1]=' '
    carve(1,1)
    return grid

for row in maze(15,15): print(''.join(row))
