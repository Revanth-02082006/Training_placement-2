import datetime
for i in range(2000,2100):
    for j in range(1,13):
        for k in range(1,32):
            try:
                d=datetime.date(i,j,k).strftime("%d%m%Y")
                if d==d[::-1]:print(d)
            except:pass
