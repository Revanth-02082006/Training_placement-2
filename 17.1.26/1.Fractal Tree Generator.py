import turtle

def draw_branch(t, length):
    if length > 5:
        t.forward(length)
        t.right(20)
        draw_branch(t, length - 15)
        t.left(40)
        draw_branch(t, length - 15)
        t.right(20)
        t.backward(length)

screen = turtle.Screen()
t = turtle.Turtle()
t.left(90)
t.speed("fastest")
draw_branch(t, 100)
screen.mainloop()
