import matplotlib.pyplot as plt
import numpy as np

def mandelbrot(h, w, max_iter=20):
    x = np.linspace(-2, 1, w)
    y = np.linspace(-1.5, 1.5, h)
    C = x + y[:, None]*1j
    Z = np.zeros(C.shape, dtype=complex)
    div_time = np.zeros(C.shape, dtype=int)
    for i in range(max_iter):
        Z = Z**2 + C
        diverge = np.abs(Z) > 2
        div_now = diverge & (div_time==0)
        div_time[div_now] = i
        Z[diverge] = 2
    return div_time

plt.imshow(mandelbrot(400,400))
plt.show()
