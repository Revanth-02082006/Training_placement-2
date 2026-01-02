num = 153
temp, s = num, 0
while temp > 0:
    d = temp%10
    s += d*d*d
    temp //= 10
print("Armstrong" if s==num else "Not Armstrong")
