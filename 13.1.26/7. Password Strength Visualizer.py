import re

def strength(pw):
    score = 0
    if len(pw)>=8: score+=1
    if re.search(r'[A-Z]',pw): score+=1
    if re.search(r'[0-9]',pw): score+=1
    if re.search(r'[^A-Za-z0-9]',pw): score+=1
    return score

pw = "P@ssw0rd123"
print("Strength:", "█"*strength(pw))
