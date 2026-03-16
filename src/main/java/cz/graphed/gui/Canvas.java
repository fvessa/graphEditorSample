package cz.graphed.gui;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import cz.graphed.model.AbstractGraphicObject;

public class Canvas extends JPanel {
    private List<AbstractGraphicObject> graphicObjects = new ArrayList<>();

    public Canvas() {
        setPreferredSize(new Dimension(800, 600));
    }

    public void add(AbstractGraphicObject object) {
        graphicObjects.add(object);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (var o : graphicObjects) {
            o.draw(g);
        }
    }
}
