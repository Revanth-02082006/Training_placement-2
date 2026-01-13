import requests, re

url="https://news.ycombinator.com/"
html=requests.get(url).text
words=re.findall(r'\w+',html)
positive=len([w for w in words if w.lower() in ['gain','rise','profit']])
negative=len([w for w in words if w.lower() in ['loss','fall','drop']])
print("Sentiment:",positive-negative)
