import winsound, time

MORSE = {'A':'.-', 'B':'-...', 'C':'-.-.', 'D':'-..', 'E':'.'}

def play_morse(text):
    for ch in text.upper():
        if ch in MORSE:
            for symbol in MORSE[ch]:
                if symbol == '.':
                    winsound.Beep(600, 200)
                else:
                    winsound.Beep(600, 600)
            time.sleep(0.3)

play_morse("ABC")
