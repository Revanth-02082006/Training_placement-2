s = "apple banana apple orange banana apple"
words = s.split()
count = {}
for w in words:
    count[w] = count.get(w,0)+1
print(count)
