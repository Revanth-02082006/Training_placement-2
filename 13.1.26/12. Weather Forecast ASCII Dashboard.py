import requests

city="London"
data=requests.get(f"http://wttr.in/{city}?format=3").text
print("Weather:",data)
