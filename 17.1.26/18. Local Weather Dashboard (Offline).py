import csv
import matplotlib.pyplot as plt

data = {"Jan":20,"Feb":22,"Mar":25,"Apr":30}
plt.plot(data.keys(), data.values())
plt.title("Weather Dashboard")
plt.show()
