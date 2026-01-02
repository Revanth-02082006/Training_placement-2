word = "python"
guessed = ["_"] * len(word)
attempts = 6

while attempts > 0 and "_" in guessed:
    print(" ".join(guessed))
    guess = input("Guess a letter: ")
    if guess in word:
        for i,c in enumerate(word):
            if c==guess: guessed[i]=c
    else:
        attempts -= 1
        print("Wrong! Attempts left:", attempts)

print("You win!" if "_" not in guessed else "You lose! Word was", word)
