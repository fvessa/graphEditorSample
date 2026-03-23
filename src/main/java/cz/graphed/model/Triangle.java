package cz.graphed.model;

import java.awt.*;

public class Triangle extends AbstractGraphicObject {
    protected int a;

    public Triangle() {
    }

    private int cx,cy;

    public Triangle(Point position, Color color, int a) {
        super(position, color);
        this.a = a;
        computeC();
    }

    private void computeC() {
        cx=position.x+(int)Math.round(a/2.0);
        cy=position.y-(int)Math.round(a*Math.sin(Math.PI/3));
    }

    public void setA(int a){
        this.a = a;
    }

    @Override
    public void draw(Graphics g){
        var g2 = (Graphics2D)g;
        g2.drawLine(position.x,position.y,position.x+a,position.y+a);
        g2.drawLine(position.x,position.y, position.x+a, position.y);
        g2.drawLine(position.x+a,position.y,position.x+a,position.y+a);

    }

    @Override
    public boolean contains(Point p) {
        int dx = (int)Math.round((p.y-position.y)*Math.tan(Math.PI/6));
        return p.x  >= position.x && p.x<position.x + a -dx
                && p.y<= position.y && p.y>=cy;
    }
}
