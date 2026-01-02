arr = [1,2,2,3,4,4,5]
res = []
for n in arr:
    if n not in res:
        res.append(n)
print(res)
