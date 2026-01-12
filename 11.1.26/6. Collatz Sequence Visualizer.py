def c(n):
    while n!=1:
        print("*"*n)
        n=n//2 if n%2==0 else 3*n+1
c(7)
