import random

characters = ["wizard", "knight", "dragon", "elf"]
places = ["forest", "castle", "village", "mountain"]
actions = ["found treasure", "fought bravely", "cast a spell", "escaped danger"]

story = f"The {random.choice(characters)} in the {random.choice(places)} {random.choice(actions)}."
print(story)
