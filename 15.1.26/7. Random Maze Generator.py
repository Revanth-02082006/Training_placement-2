import random

def generate_maze(n):
    maze = [["#" for _ in range(n)] for _ in range(n)]
    for i in range(n):
        maze[i][random.randint(0,n-1)] = " "
    for row in maze:
        print("".join(row))

generate_maze(10)
