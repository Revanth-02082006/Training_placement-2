import time

text = "Python is fun!"
print("Type this:", text)
start = time.time()
typed = input(">>> ")
end = time.time()
print("Speed:", len(text)/(end-start), "chars/sec")
