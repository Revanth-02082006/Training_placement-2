import re
text="Contact us at test@example.com or hello@domain.org"
emails=re.findall(r"[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}",text)
print("Emails found:",emails)
