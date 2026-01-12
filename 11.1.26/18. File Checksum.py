import hashlib
print(hashlib.md5(open(__file__,"rb").read()).hexdigest())
