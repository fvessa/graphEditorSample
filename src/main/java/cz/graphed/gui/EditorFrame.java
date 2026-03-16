package cz.graphed.gui;

import cz.graphed.model.Square;

import javax.swing.*;
import java.awt.*;

public class EditorFrame extends JFrame {

    private Canvas canvas = new Canvas();

    public EditorFrame() throws HeadlessException {
        super("gEditor");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(canvas,BorderLayout.CENTER);

        initSampleData();

        pack();
    }

    private void initSampleData() {
        canvas.add(new Square(new Point(50,50),Color.BLUE,25));
        canvas.add(new Square(new Point(75,75),Color.RED,25));
        canvas.add(new Square(new Point(100,100),Color.ORANGE,25));
        canvas.add(new Square(new Point(125,125),Color.MAGENTA,25));
    }

}
