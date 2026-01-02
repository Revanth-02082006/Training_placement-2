import heapq
graph={"A":{"B":1,"C":4},"B":{"C":2,"D":5},"C":{"D":1},"D":{}}
def dijkstra(start):
    dist={node:float("inf") for node in graph}
    dist[start]=0; pq=[(0,start)]
    while pq:
        d,node=heapq.heappop(pq)
        for neigh,w in graph[node].items():
            if d+w<dist[neigh]:
                dist[neigh]=d+w
                heapq.heappush(pq,(dist[neigh],neigh))
    return dist
print(dijkstra("A"))
