votes={"Alice":0,"Bob":0}
for _ in range(5):
    choice=input("Vote Alice/Bob: ")
    if choice in votes: votes[choice]+=1
print("Results:",votes)
