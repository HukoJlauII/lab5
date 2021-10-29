package GrS;

import java.awt.*;

public class Oval extends Shape {
    protected int width;
    protected int height;
    public Oval(int x, int y, int width, int height, Color color) {
        this.color=color;
        this.height = height;
        this.width = width;
        pos = new Point(x, y);
    }

    public Oval() {
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

