with open("sample.txt") as f:
    text=f.read()
words=text.split()
print("Word count:",len(words))
