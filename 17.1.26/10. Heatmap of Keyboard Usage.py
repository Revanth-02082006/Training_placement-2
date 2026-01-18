import matplotlib.pyplot as plt
import random

keys = "abcdefghijklmnopqrstuvwxyz"
usage = {k: random.randint(1,100) for k in keys}
plt.bar(usage.keys(), usage.values())
plt.title("Keyboard Usage Heatmap")
plt.show()
