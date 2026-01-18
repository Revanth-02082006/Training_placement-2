def caesar(text, shift):
    result = ""
    for ch in text:
        if ch.isalpha():
            base = ord('A') if ch.isupper() else ord('a')
            result += chr((ord(ch)-base+shift)%26+base)
        else:
            result += ch
    return result

print(caesar("HELLO", 3))
print(caesar("KHOOR", -3))
