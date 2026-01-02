board = [" "]*9
def print_board():
    for i in range(0,9,3): print(board[i:i+3])

turn = "X"
for _ in range(9):
    print_board()
    pos = int(input(f"{turn}'s move (0-8): "))
    if board[pos]==" ":
        board[pos]=turn
        turn = "O" if turn=="X" else "X"
print_board()
