import markdown

text = "# Hello World\nThis is a sample markdown."
html = markdown.markdown(text)
print(html)
