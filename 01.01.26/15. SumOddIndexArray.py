arr = [10,20,30,40,50]
s = 0
for i in range(1,len(arr),2):
    s += arr[i]
print("Sum of odd index elements =", s)
