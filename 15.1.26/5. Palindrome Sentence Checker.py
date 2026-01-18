def is_palindrome_sentence(sentence):
    cleaned = ''.join(ch.lower() for ch in sentence if ch.isalnum())
    return cleaned == cleaned[::-1]

print(is_palindrome_sentence("A man, a plan, a canal: Panama"))
