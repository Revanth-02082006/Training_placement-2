import time, datetime

alarm = input("Set alarm (HH:MM): ")
while True:
    now = datetime.datetime.now().strftime("%H:%M")
    if now == alarm:
        print("Wake up!")
        break
    time.sleep(30)
