package GrS;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                int R = (int) (Math.random() * 256);
                int G = (int) (Math.random() * 256);
                int B = (int) (Math.random() * 256);
                int x = (int) (Math.random() * 3);
                switch (x) {
                    case 0: {
                        Rectangle r = new Rectangle(j * 300, i * 200, (int) (Math.random() * 100 + 50), (int) (Math.random() * 50 + 20), new Color(R, G, B));
                        g.setColor(r.getColor());
                        g.drawRect((int) r.getX(), (int) r.getY(), r.getWidth(), r.getHeight());
                        break;
                    }
                    case 1: {
                        Oval o = new Oval(j * 100, i * 100, (int) (Math.random() * 100 + 50), (int) (Math.random() * 50 + 20), new Color(R, G, B));
                        g.setColor(o.getColor());
                        g.drawOval((int) o.getX(), (int) o.getY(), o.getWidth(), o.getHeight());
                        break;
                    }
                    case 2: {
                        Circle c = new Circle(j * 100, i * 100, (int) (Math.random() * 100 + 10), new Color(R, G, B));
                        g.setColor(c.getColor());
                        g.drawOval((int) c.getX(), (int) c.getY(), c.getWidth(), c.getHeight());
                        break;
                    }
                    default:
                        break;
                }
            }
        }
    }
    public Frame() {
        super("Test");
        setLayout(null);
        setSize(1600,900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public static void main(String[] args)
    {
        new Frame();
    }
}
