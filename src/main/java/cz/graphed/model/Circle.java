package cz.graphed.model;

import java.awt.*;

public class Circle extends AbstractGraphicObject {
    protected int a;

    public Circle() {
    }

    public Circle(Point position, Color color, int a) {
        super(position, color);
        this.a = a;
    }

    public void setA(int a){
        this.a = a;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(color);
        g2.drawOval(position.x,position.y,a,a);
    }

    @Override
    public boolean contains(Point p) {
        return false;
    }
}
