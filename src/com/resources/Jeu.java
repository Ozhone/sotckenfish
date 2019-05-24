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
	
	public Jeu() throws IOException {}
	private ImageIcon[] figures = loadImages();
	public ImageIcon[] loadImages() throws IOException {
		
		ImageIcon[] bombe = { new ImageIcon("mine.png") };
		ImageIcon[] vide = { new ImageIcon("vide.png")};
		int i = 0;
		int j = 0;
		int cpt = 0;
		ImageIcon[] tableau = {new ImageIcon()};
		bombe[i].setDescription("bombe");
		vide[j].setDescription("vide");
	
		//for (int a = 0; a<bombe.length;a++) {
			//for(int b= 0; b<vide.length;b++) {
				//tableau[cpt]= bombe[a]+vide[b];
				//System.out.println(tableau[cpt]+"|");
				//cpt++;
			//}
		System.out.println(bombe);
		System.out.println(vide);
		return tableau;
			
		}
	
	}
	
	
