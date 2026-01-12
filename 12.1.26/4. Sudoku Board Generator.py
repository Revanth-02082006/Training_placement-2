import random
def valid(b,r,c,n):
    return all(b[r][i]!=n for i in range(9)) and all(b[i][c]!=n for i in range(9))
b=[[0]*9 for _ in range(9)]
for r in range(9):
    for c in range(9):
        n=random.randint(1,9)
        if valid(b,r,c,n):b[r][c]=n
print(b)
