import random

num = random.randint(1, 100)
guess = None
while guess != num:
    guess = int(input("Guess a number (1-100): "))
    if guess < num:
        print("Too low!")
    elif guess > num:
        print("Too high!")
print("Correct! The number was", num)
