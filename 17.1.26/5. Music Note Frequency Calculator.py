import math

def note_to_freq(note):
    A4 = 440
    notes = {'C':-9,'C#':-8,'D':-7,'D#':-6,'E':-5,'F':-4,'F#':-3,'G':-2,'G#':-1,'A':0,'A#':1,'B':2}
    name, octave = note[:-1], int(note[-1])
    n = notes[name] + 12*(octave-4)
    return A4 * (2**(n/12))

print(note_to_freq("C4"))
print(note_to_freq("A4"))
