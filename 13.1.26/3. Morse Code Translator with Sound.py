import winsound, time

morse = { 'A':'.-', 'B':'-...', 'C':'-.-.' }
text = "ABC"
for ch in text:
    for symbol in morse[ch]:
        if symbol == '.':
            winsound.Beep(700, 200)
        else:
            winsound.Beep(700, 600)
        time.sleep(0.2)
