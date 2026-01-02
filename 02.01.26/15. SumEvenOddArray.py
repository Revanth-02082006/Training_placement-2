arr = [1,2,3,4,5,6]
even_sum = odd_sum = 0
for n in arr:
    if n%2==0: even_sum+=n
    else: odd_sum+=n
print("Even sum =", even_sum, "Odd sum =", odd_sum)
