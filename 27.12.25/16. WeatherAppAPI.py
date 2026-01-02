import requests

city = "Chennai"
url = f"http://api.weatherapi.com/v1/current.json?key=YOUR_KEY&q={city}"
data = requests.get(url).json()
print("Temperature in", city, "=", data["current"]["temp_c"], "°C")
