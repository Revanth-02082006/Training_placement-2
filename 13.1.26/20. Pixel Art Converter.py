from PIL import Image

img=Image.open("sample.jpg")
small=img.resize((50,50),Image.NEAREST)
small.show()
