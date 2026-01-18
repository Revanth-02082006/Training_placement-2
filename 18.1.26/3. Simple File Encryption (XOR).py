def xor_encrypt(text, key):
    return "".join(chr(ord(c)^key) for c in text)

msg = "HelloWorld"
enc = xor_encrypt(msg, 23)
dec = xor_encrypt(enc, 23)
print("Encrypted:", enc)
print("Decrypted:", dec)
