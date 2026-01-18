from wordcloud import WordCloud
import matplotlib.pyplot as plt

text = "Python AI Data Science Machine Learning Copilot Portfolio"
wc = WordCloud(width=400, height=200).generate(text)
plt.imshow(wc, interpolation="bilinear")
plt.axis("off")
plt.show()
