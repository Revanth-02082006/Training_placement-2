import java.awt.*;
import javax.swing.*;
import java.util.*;

class Ball {
    double x, y, vx, vy;
    int radius = 20;
    Color color;

    public Ball(double x, double y, double vx, double vy, Color color) {
        this.x=x; this.y=y; this.vx=vx; this.vy=vy; this.color=color;
    }

    public void move(int w, int h) {
        x += vx; y += vy;
        if (x < 0 || x > w-radius) vx *= -1;
        if (y < 0 || y > h-radius) vy *= -1;
    }
}

public class PhysicsEngine extends JPanel {
    java.util.List<Ball> balls = new ArrayList<>();

    public PhysicsEngine() {
        balls.add(new Ball(50,50,2,3,Color.RED));
        balls.add(new Ball(100,100,-3,2,Color.BLUE));
        Timer timer = new Timer(20, e -> { update(); repaint(); });
        timer.start();
    }

    private void update() {
        for (Ball b : balls) b.move(getWidth(), getHeight());
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Ball b : balls) {
            g.setColor(b.color);
            g.fillOval((int)b.x,(int)b.y,b.radius,b.radius);
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Physics Engine");
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new PhysicsEngine());
        f.setVisible(true);
    }
}
