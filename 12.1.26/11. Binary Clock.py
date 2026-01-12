import time
while True:
    t=time.strftime("%H:%M:%S")
    print(" ".join(bin(int(x))[2:].zfill(6) for x in t.split(":")),end="\r")
    time.sleep(1)
