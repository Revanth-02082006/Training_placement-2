import os, shutil

def organize(path):
    for file in os.listdir(path):
        if file.endswith(".txt"):
            shutil.move(os.path.join(path,file), os.path.join(path,"Text",file))
        elif file.endswith(".jpg"):
            shutil.move(os.path.join(path,file), os.path.join(path,"Images",file))

organize("C:/Users/YourFolder")
