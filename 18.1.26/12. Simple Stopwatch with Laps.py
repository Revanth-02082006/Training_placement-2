import time

laps=[]
print("Press Enter to start")
input()
start=time.time()
for i in range(3):
    input("Lap...")
    laps.append(time.time()-start)
print("Lap times:",laps)
