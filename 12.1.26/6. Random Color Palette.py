import random
for _ in range(5):
    print("#"+"".join(random.choice("0123456789ABCDEF") for _ in range(6)))
