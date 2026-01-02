for num in range(100,1000):
    s = sum(int(d)**3 for d in str(num))
    if s == num:
        print(num, end=" ")
