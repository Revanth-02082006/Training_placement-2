mat = [[1,2,3],[2,4,5],[3,5,6]]
symmetric = all(mat[i][j]==mat[j][i] for i in range(len(mat)) for j in range(len(mat)))
print("Symmetric" if symmetric else "Not Symmetric")
