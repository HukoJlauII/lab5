package GrS;

import java.awt.*;

public class Rectangle extends Shape {
    protected int width;
    protected int height;

    public Rectangle(int x, int y, int width, int height, Color color) {
        this.color=color;
        this.height = height;
        this.width = width;
        pos = new Point(x, y);
    }
    public double getX() {
        return pos.getX();
    }

    public double getY() {
        return pos.getY();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}