import numpy as np
import matplotlib.pyplot as plt

def step(grid):
    neighbors = sum(np.roll(np.roll(grid, i, 0), j, 1)
                    for i in (-1,0,1) for j in (-1,0,1)
                    if (i!=0 or j!=0))
    return (neighbors==3) | (grid & (neighbors==2))

grid = np.random.randint(2, size=(50,50))
for _ in range(50):
    plt.imshow(grid, cmap="binary")
    plt.pause(0.1)
    grid = step(grid)
