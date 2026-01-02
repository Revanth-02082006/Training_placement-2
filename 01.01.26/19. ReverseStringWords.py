s = "Python is fun"
words = s.split()
res = []
for w in words:
    res.append(w[::-1])
print(" ".join(res))
