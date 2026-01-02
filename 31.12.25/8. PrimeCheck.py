num = 29
prime = True
for i in range(2, num):
    if num % i == 0:
        prime = False
        break
print("Prime" if prime else "Not Prime")
