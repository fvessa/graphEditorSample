package cz.graphed.model;

import java.awt.*;

public class RectangleRounded extends AbstractGraphicObject {
    protected int a;
    protected int b;

    public RectangleRounded() {
    }

    public RectangleRounded(Point position, Color color, int a, int b) {
        super(position, color);
        this.a = a;
        this.b = b;
    }

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(color);
        g2.drawRoundRect(position.x,position.y,a,b,10,10);
    }

    @Override
    public boolean contains(Point p) {
        return false;
    }
}
