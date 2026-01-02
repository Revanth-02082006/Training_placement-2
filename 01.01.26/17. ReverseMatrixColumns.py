mat = [[1,2,3],[4,5,6],[7,8,9]]
for j in range(len(mat[0])):
    col = []
    for i in range(len(mat)):
        col.append(mat[i][j])
    print(col[::-1])
