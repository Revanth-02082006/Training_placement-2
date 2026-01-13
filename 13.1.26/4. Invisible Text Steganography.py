def hide_message(msg):
    return ''.join([c + '\u200b' for c in msg])

def reveal_message(hidden):
    return hidden.replace('\u200b','')

secret = hide_message("HELLO")
print(reveal_message(secret))
