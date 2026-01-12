import random,time,os
w,h=40,20
snow=[[" "]*w for _ in range(h)]
while True:
    for i in range(h-1,0,-1):
        snow[i]=snow[i-1][:]
    snow[0]=["*" if random.random()<0.1 else " " for _ in range(w)]
    os.system("cls" if os.name=="nt" else "clear")
    for r in snow:print("".join(r))
    time.sleep(0.2)
