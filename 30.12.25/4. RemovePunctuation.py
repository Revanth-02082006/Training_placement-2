import string
s = "Hello, World! Python is great."
print(s.translate(str.maketrans("", "", string.punctuation)))
