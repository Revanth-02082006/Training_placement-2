board = [" "]*9

def print_board():
    for i in range(0,9,3):
        print(board[i:i+3])

def move(pos, player):
    if board[pos]==" ":
        board[pos]=player

print_board()
move(0,"X")
move(4,"O")
print_board()
