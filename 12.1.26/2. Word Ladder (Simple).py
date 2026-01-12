from collections import deque
words={"hit","hot","dot","dog","cog"}
q=deque([("hit",[ "hit"])])
while q:
    w,path=q.popleft()
    if w=="cog":print(path);break
    for v in words:
        if sum(a!=b for a,b in zip(w,v))==1:q.append((v,path+[v]))
