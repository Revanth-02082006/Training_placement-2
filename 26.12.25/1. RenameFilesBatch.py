import os

folder = "test_folder"
for i, filename in enumerate(os.listdir(folder)):
    new_name = f"file_{i}.txt"
    os.rename(os.path.join(folder, filename), os.path.join(folder, new_name))
print("Files renamed successfully.")
