num = 48291
even_sum = odd_sum = 0
while num > 0:
    d = num % 10
    if d%2==0: even_sum += d
    else: odd_sum += d
    num //=10
print("Even sum =", even_sum, "Odd sum =", odd_sum)
