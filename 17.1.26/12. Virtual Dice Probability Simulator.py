import random

rolls = [random.randint(1,6) for _ in range(1000)]
prob = {i: rolls.count(i)/1000 for i in range(1,7)}
print("Dice probabilities:", prob)
