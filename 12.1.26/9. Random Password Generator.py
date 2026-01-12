import random,string
print("".join(random.choice(string.ascii_letters+string.digits) for _ in range(12)))
