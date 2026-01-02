import requests

url = "https://api.exchangerate-api.com/v4/latest/USD"
data = requests.get(url).json()
amount = 100
print("100 USD in INR =", amount * data["rates"]["INR"])
