s = "apple banana apricot mango"
words = s.split()
count = 0
for w in words:
    if w[0].lower() == "a":
        count += 1
print("Words starting with 'a' =", count)
