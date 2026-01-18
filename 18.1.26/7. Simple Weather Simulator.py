import random

conditions = ["Sunny","Rainy","Cloudy","Stormy"]
temp = random.randint(15,35)
print("Weather:", random.choice(conditions), "| Temp:", temp,"°C")
