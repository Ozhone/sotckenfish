package com.resources;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JToggleButton;
import javax.swing.border.Border;

public class Case {
    private Case[] voisins = new Case[8];
    private JToggleButton button ;

    public Case() {
        button = new JToggleButton();
        Border lineBorder =
                BorderFactory.createLineBorder(Color.GRAY, 1);
        button.setBorder(lineBorder);
        button.setOpaque(true);
    }

    public JComponent getComponent() {
        return button;
    }

    public Case getVoisin(IndexVoisin iv) {
        return voisins[iv.ordinal()];
    }
    public Case setVoisin(IndexVoisin iv, Case c) {
        return voisins[iv.ordinal()];
    }
}

enum IndexVoisin {
    VOISIN_NORD,
    VOISIN_NORD_EST,
    VOISIN_EST,
    VOISIN_SUD_EST,
    VOISIN_SUD, VOISIN_SUD_OUEST, VOISIN_OUEST,
    VOISIN_NORD_OUEST;
}