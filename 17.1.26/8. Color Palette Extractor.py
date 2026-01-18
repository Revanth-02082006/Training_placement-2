from PIL import Image
import requests, io
from sklearn.cluster import KMeans
import numpy as np

url = "https://picsum.photos/200"
img = Image.open(io.BytesIO(requests.get(url).content))
pixels = np.array(img).reshape(-1,3)
kmeans = KMeans(n_clusters=5).fit(pixels)
print("Dominant colors:", kmeans.cluster_centers_)
