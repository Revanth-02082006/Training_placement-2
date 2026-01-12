def caesar(s,k):return "".join(chr((ord(c)-97+k)%26+97) if c.isalpha() else c for c in s)
print(caesar("hello world",3))
