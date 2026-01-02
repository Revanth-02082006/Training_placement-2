mat = [[1,0,0],[0,1,0],[0,0,1]]
identity = all(mat[i][j]==(1 if i==j else 0) for i in range(3) for j in range(3))
print("Identity Matrix" if identity else "Not Identity Matrix")
