import random, matplotlib.pyplot as plt

rolls=[random.randint(1,6) for _ in range(1000)]
plt.hist(rolls,bins=6)
plt.show()
