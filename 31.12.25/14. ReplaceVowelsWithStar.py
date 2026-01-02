s = "programming"
res = ""
for ch in s:
    if ch in "aeiouAEIOU":
        res += "*"
    else:
        res += ch
print(res)
