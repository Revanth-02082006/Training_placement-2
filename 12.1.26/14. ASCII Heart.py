for y in range(15,-15,-1):
    row=""
    for x in range(-30,30):
        row+="*" if (x**2+y**2-1)**3-(x**2)*(y**3)<=0 else " "
    print(row)
