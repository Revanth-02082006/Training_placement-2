import pandas as pd
df1 = pd.DataFrame({"ID":[1,2],"Name":["A","B"]})
df2 = pd.DataFrame({"ID":[1,2],"Age":[20,30]})
print(pd.merge(df1,df2,on="ID"))
