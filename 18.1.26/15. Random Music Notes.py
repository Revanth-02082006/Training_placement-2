import random

notes=["A","B","C","D","E","F","G"]
melody=[random.choice(notes) for _ in range(8)]
print("Melody:",melody)
