import matplotlib.pyplot as plt
sizes = [30,40,30]
labels = ["Apples","Bananas","Cherries"]
plt.pie(sizes, labels=labels, autopct="%1.1f%%")
plt.show()
