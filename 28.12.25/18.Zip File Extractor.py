import zipfile
with zipfile.ZipFile("sample.zip","r") as z:
    z.extractall("output_folder")
