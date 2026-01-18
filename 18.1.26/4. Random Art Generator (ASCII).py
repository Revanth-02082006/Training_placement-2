import random

chars = "@#$%&*"
for _ in range(20):
    print("".join(random.choice(chars) for _ in range(40)))
