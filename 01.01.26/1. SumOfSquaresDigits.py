num = 1234
s = 0
while num > 0:
    d = num % 10
    s += d*d
    num //= 10
print("Sum of squares of digits =", s)
