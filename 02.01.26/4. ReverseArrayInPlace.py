arr = [1,2,3,4,5]
for i in range(len(arr)//2):
    arr[i], arr[-i-1] = arr[-i-1], arr[i]
print(arr)
