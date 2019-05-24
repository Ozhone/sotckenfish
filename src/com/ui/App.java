package com.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.Deque;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.RootPaneContainer;
import javax.swing.SwingUtilities;

import com.resources.Ressources;
import com.resources.ComposantCase;
import com.resources.Case;

public class App extends Frame {

	private Partie jeu = new Partie();

	public App() throws IOException{
		super("Démineur");
		setDefaultBounds(100,100,900,600);
	}  
	
	private static final int ROW_COUNT = 10;
	private static final int COLUMN_COUNT = 10;

	@Override
	public void init(JFrame frame) {
		Container cp = frame.getContentPane();
		cp.setLayout(new GridLayout(ROW_COUNT, COLUMN_COUNT));
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
		cp.add(createButton());
	}        
	}
	}

	public JComponent createButton() {
		ComposantCase button = new ComposantCase();
		return button;
	}

	public static void main(String[] args) throws IOException {
		App example = new App();
		SwingUtilities.invokeLater(example);
	}
}

