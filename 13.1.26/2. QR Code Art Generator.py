import qrcode

qr = qrcode.QRCode()
qr.add_data("https://github.com/Revanth-02082006")
qr.make()
qr.print_ascii()
