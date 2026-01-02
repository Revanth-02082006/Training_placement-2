def reverse(num, rev=0):
    if num == 0: return rev
    return reverse(num//10, rev*10 + num%10)

print(reverse(1234))
