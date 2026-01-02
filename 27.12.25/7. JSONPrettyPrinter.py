import json

data = '{"name":"Revanth","age":20,"skills":["Python","Java"]}'
parsed = json.loads(data)
print(json.dumps(parsed, indent=4))
