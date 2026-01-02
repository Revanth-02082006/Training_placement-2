import csv

with open("data.csv", "w", newline="") as f:
    writer = csv.writer(f)
    writer.writerow(["Name", "Age"])
    writer.writerow(["Revanth", 20])

with open("data.csv", "r") as f:
    reader = csv.reader(f)
    for row in reader:
        print(row)
