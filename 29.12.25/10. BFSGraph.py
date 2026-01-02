from collections import deque
graph={"A":["B","C"],"B":["D"],"C":["D"],"D":[]}
visited=set(); q=deque(["A"])
while q:
    node=q.popleft()
    if node not in visited:
        print(node,end=" ")
        visited.add(node)
        q.extend(graph[node])
