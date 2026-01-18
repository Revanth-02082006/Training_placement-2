import re

text = "I love Python 😍 but debugging makes me 😡 sometimes!"
emojis = re.findall(r'[\U0001F600-\U0001F64F]', text)
print("Emojis found:", emojis)
