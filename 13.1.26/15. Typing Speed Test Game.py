import time

sentence="Python makes coding fun!"
print(sentence)
start=time.time()
typed=input("Type here: ")
end=time.time()
print("WPM:",len(typed.split())/((end-start)/60))
