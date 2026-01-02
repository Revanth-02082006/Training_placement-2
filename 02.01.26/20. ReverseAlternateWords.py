s = "Python is very powerful"
words = s.split()
for i in range(0,len(words),2):
    words[i] = words[i][::-1]
print(" ".join(words))
