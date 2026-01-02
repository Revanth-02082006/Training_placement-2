import socket
s=socket.socket()
s.bind(("localhost",1234))
s.listen(1)
print("Server listening...")
conn,addr=s.accept()
print("Connected:",addr)
conn.send(b"Hello Client")
conn.close()
