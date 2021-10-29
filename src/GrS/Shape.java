package GrS;

import java.awt.*;

public abstract class Shape {
    protected Color color;
    protected Point pos;
    public Shape(){
        color=Color.black;
    }
    public Shape(Color color,Point pos){
        this.color=color;
        this.pos=pos;
    }
    public void setPos(Point pos) {
        this.pos = pos;
    }
    public Point getPos() {
        return pos;
    }

    public Color getColor() {
        return color;
    }
}
