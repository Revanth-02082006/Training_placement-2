mat = [[1,2,3],[4,5,6],[7,8,9]]
s = 0
for i in range(len(mat)):
    s += mat[i][i]
print("Diagonal sum =", s)
