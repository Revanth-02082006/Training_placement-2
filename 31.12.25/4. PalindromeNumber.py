num = 121
temp, rev = num, 0
while temp > 0:
    rev = rev*10 + temp%10
    temp //= 10
print("Palindrome" if rev==num else "Not Palindrome")
