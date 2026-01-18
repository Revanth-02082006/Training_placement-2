import random

ball = [5,5]
paddle = 5
for _ in range(10):
    ball[0]+=random.choice([-1,1])
    ball[1]+=random.choice([-1,1])
    print("Ball:",ball,"Paddle:",paddle)
