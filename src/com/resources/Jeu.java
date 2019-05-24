package com.resources;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

import javax.swing.ImageIcon;

import com.resources.Ressources;

import com.resources.Jeu;

public class Jeu {
	
	private BufferedImage figures = loadImages();

	public Jeu() throws IOException {}
	
	public BufferedImage loadImages() throws IOException {
		
		BufferedImage bombe = Ressources.loadBufferedImage("mine.png");
		BufferedImage vide = Ressources.loadBufferedImage("vide.png");
		vide.setDescription("vide");
		bombe.setDescription("bombe");
		
		return bombe;
	}

	public Deque<ImageIcon> creerPioche(){
		LinkedList<ImageIcon> pioche = new LinkedList<>();
		int row = 4;
		int col = 3;
		int x = 0;
		int z = 0;
		int k = 0;
		for (k = 0; k <2; k++) {
		for (x = 0; x < row; x++) {
			for (z = 0; z < col; z++) {
			pioche.add(figures[x][z]);
			Collections.shuffle(pioche);
		}
		}
		}
System.out.println(pioche);
		return pioche;
	}
	
	
}
