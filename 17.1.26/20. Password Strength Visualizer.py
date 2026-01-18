import math

def strength(password):
    charset = 26+26+10+10
    entropy = len(password)*math.log2(charset)
    print("Entropy:", entropy, "bits")

strength("MyP@ssw0rd123")
