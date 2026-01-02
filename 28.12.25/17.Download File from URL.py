import requests
url = "https://example.com/file.txt"
r = requests.get(url)
with open("file.txt","wb") as f:
    f.write(r.content)
