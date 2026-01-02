import socket
s=socket.socket()
s.connect(("localhost",1234))
print(s.recv(1024).decode())
s.close()
