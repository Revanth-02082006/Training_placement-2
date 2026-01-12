import random
emojis=["😀","🌸","🔥","⚡","🍀","🎶"]
for _ in range(10):
    print("".join(random.choice(emojis) for _ in range(10)))
