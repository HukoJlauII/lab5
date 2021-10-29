package GrS;

import java.awt.*;

public class Circle extends Oval{
    public Circle (int x, int y, int radius, Color color){
        this.width=radius;
        this.height=radius;
        pos = new Point(x, y);
        this.color=color;
    }

}
