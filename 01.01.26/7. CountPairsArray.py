arr = [1,2,3,4,5]
count = 0
for i in range(len(arr)):
    for j in range(i+1,len(arr)):
        count += 1
print("Pairs =", count)
