from PIL import Image, ImageDraw, ImageFont

text="Hello Revanth!"
img=Image.new("RGB",(400,100),"white")
draw=ImageDraw.Draw(img)
font=ImageFont.truetype("arial.ttf",30)
draw.text((10,30),text,font=font,fill="black")
img.show()
