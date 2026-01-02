arr = [1,2,3,4,5,6]
mid = len(arr)//2
arr[:mid] = arr[:mid][::-1]
print(arr)
