import matplotlib.pyplot as plt

def is_prime(n):
    if n<2: return False
    for i in range(2,int(n**0.5)+1):
        if n%i==0: return False
    return True

x=y=0; dx,dy=0,-1
points=[]
for i in range(1,200):
    if is_prime(i): points.append((x,y))
    if x==y or (x<0 and x==-y) or (x>0 and x==1-y):
        dx,dy=-dy,dx
    x,y=x+dx,y+dy

plt.scatter(*zip(*points))
plt.show()
