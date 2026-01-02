import sqlite3

conn = sqlite3.connect("test.db")
c = conn.cursor()
c.execute("CREATE TABLE IF NOT EXISTS users (id INTEGER, name TEXT)")
c.execute("INSERT INTO users VALUES (1,'Revanth')")
conn.commit()

for row in c.execute("SELECT * FROM users"):
    print(row)
conn.close()
