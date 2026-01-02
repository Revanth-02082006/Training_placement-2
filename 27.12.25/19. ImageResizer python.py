from PIL import Image

img = Image.open("sample.jpg")
img = img.resize((200,200))
img.save("resized.jpg")
