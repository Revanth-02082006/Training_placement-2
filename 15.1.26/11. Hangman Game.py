import random

words = ["python","copilot","portfolio"]
word = random.choice(words)
guessed = ["_"]*len(word)

while "_" in guessed:
    print(" ".join(guessed))
    ch = input("Guess: ")
    for i,c in enumerate(word):
        if c == ch: guessed[i] = ch
print("You win! Word:", word)
