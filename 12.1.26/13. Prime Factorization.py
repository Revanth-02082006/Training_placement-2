n=84
f=[]
d=2
while n>1:
    while n%d==0:f.append(d);n//=d
    d+=1
print(f)
