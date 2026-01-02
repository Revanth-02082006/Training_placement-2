s = "programming"
res = ""
for ch in s:
    if ch.lower() not in "aeiou":
        res += ch
print(res)
