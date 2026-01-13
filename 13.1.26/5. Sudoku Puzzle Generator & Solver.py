import random

def valid(board, row, col, num):
    for i in range(9):
        if board[row][i]==num or board[i][col]==num:
            return False
    return True

def solve(board):
    for r in range(9):
        for c in range(9):
            if board[r][c]==0:
                for num in range(1,10):
                    if valid(board,r,c,num):
                        board[r][c]=num
                        if solve(board): return True
                        board[r][c]=0
                return False
    return True

board = [[0]*9 for _ in range(9)]
solve(board)
print(board)
