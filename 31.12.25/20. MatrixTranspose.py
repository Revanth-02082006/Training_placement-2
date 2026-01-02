mat = [[1,2,3],[4,5,6]]
rows, cols = len(mat), len(mat[0])
trans = [[0]*rows for _ in range(cols)]
for i in range(rows):
    for j in range(cols):
        trans[j][i] = mat[i][j]
print(trans)
