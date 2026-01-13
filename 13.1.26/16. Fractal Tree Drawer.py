import turtle

def tree(branch):
    if branch<10: return
    turtle.forward(branch)
    turtle.right(20); tree(branch-15)
    turtle.left(40); tree(branch-15)
    turtle.right(20); turtle.backward(branch)

turtle.left(90)
tree(100)
turtle.done()
