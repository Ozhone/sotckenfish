package com.resources;
	
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JToggleButton;
import javax.swing.border.Border;

public class ComposantCase extends JToggleButton {
    private ComposantCase[] voisins = new ComposantCase[8];
    public ComposantCase() {
        super();
        Border lineBorder =
                BorderFactory.createLineBorder(Color.GRAY, 1);
        setBorder(lineBorder);
        setOpaque(true);
    }

    public ComposantCase getVoisin(IndexVoisin iv) {
        return voisins[iv.ordinal()];
    }

    public ComposantCase setVoisin(IndexVoisin iv, ComposantCase c) {
        return voisins[iv.ordinal()];
    }
}


