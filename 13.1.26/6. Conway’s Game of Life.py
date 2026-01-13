import numpy as np
import time

grid = np.random.randint(2, size=(10,10))
while True:
    print(grid)
    time.sleep(1)
    new = grid.copy()
    for i in range(10):
        for j in range(10):
            neighbors = np.sum(grid[i-1:i+2,j-1:j+2]) - grid[i,j]
            if grid[i,j]==1 and neighbors not in [2,3]:
                new[i,j]=0
            elif grid[i,j]==0 and neighbors==3:
                new[i,j]=1
    grid=new
