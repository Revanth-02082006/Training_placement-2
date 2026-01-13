import re
from collections import Counter

text = "Hello 😊😊! Python is fun 🐍🐍🐍!"
emojis = re.findall(r'[\U0001F600-\U0001F64F\U0001F300-\U0001F5FF]+', text)
print(Counter(emojis))
