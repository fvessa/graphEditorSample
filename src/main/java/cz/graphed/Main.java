package cz.graphed;

import cz.graphed.gui.EditorFrame;

import javax.swing.*;

public class Main {
    static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()->new EditorFrame().setVisible(true)
        );
    }
}
