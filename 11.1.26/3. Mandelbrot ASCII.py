for y in range(-20,20):
    for x in range(-40,40):
        c=complex(x/20,y/20)
        z=0
        for i in range(30):
            z=z*z+c
            if abs(z)>2:break
        print(" .:-=+*#%@"[i%10],end="")
    print()
