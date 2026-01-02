import pandas as pd
df = pd.DataFrame({"Age":[15,25,35,45]})
print(df[df["Age"]>30])
