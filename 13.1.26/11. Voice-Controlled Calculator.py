import speech_recognition as sr

r=sr.Recognizer()
with sr.Microphone() as source:
    print("Say math expression:")
    audio=r.listen(source)
expr=r.recognize_google(audio)
print("Result:",eval(expr))
