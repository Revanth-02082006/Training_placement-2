import pandas as pd
data = {"Name":["A","B","A","C"],"Score":[10,20,30,40]}
df = pd.DataFrame(data)
print(df.groupby("Name")["Score"].mean())
