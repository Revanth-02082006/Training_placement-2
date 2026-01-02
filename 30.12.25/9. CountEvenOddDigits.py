num = 48291
even = sum(1 for d in str(num) if int(d)%2==0)
odd = sum(1 for d in str(num) if int(d)%2!=0)
print("Even digits:", even, "Odd digits:", odd)
