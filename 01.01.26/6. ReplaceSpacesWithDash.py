s = "Python is powerful"
res = ""
for ch in s:
    if ch == " ":
        res += "-"
    else:
        res += ch
print(res)
