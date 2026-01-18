import random

emojis=["😀","😎","🔥","🌟","🐍"]
for _ in range(5):
    print("".join(random.choice(emojis) for _ in range(10)))
