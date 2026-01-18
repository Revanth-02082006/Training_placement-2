import math

for x in range(-30, 31):
    y = int(10*math.sin(x/5))
    print(" "*(y+30) + "*")
