import pyperclip, time

history = []
for _ in range(5):
    data = pyperclip.paste()
    if data not in history:
        history.append(data)
    time.sleep(2)

print("Clipboard history:", history)
