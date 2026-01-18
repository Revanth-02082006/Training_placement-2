import random

def text_to_maze(text):
    size = len(text)
    maze = [["#" for _ in range(size)] for _ in range(size)]
    for i, ch in enumerate(text):
        maze[i][i] = ch
    for row in maze:
        print("".join(row))

text_to_maze("PYTHON")
