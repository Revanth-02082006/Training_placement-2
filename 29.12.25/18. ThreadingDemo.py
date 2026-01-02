import threading
def task(name):
    for i in range(3): print(name,"running")

t1=threading.Thread(target=task,args=("Thread1",))
t2=threading.Thread(target=task,args=("Thread2",))
t1.start(); t2.start()
t1.join(); t2.join()
