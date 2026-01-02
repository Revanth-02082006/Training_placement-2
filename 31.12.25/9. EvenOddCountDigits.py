num = 48291
even = odd = 0
while num > 0:
    d = num%10
    if d%2==0: even+=1
    else: odd+=1
    num//=10
print("Even =", even, "Odd =", odd)
