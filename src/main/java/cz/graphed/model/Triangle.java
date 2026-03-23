package cz.graphed.model;

import java.awt.*;

public class Triangle extends AbstractGraphicObject {
    protected int a;

    public Triangle() {
    }

    public Triangle(Point position, Color color, int a) {
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
        int x = position.x;
        int y = position.y;

        int x1 = x;//DL
        int y1 = y + a;

        int x2 = x + a;//DP
        int y2 = y + a;

        int x3 = x + a / 2;//nahore
        int y3 = y;


        g2.drawLine(x1, y1, x2, y2);//spodnihrana
        g2.drawLine(x3, y3, x1, y1);//levahrana
        g2.drawLine(x2, y2, x3, y3);//pravahrana
    }

    @Override
    public boolean contains(Point p) {
        return false;
    }
}
