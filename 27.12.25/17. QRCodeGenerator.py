import qrcode

img = qrcode.make("https://github.com/Revanth-02082006")
img.save("qrcode.png")
