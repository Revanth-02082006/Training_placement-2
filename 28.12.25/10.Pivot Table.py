import pandas as pd
data = {"Name":["A","B","A"],"Subject":["Math","Math","Science"],"Score":[90,80,70]}
df = pd.DataFrame(data)
print(pd.pivot_table(df, values="Score", index="Name", columns="Subject"))
