package view;

import java.util.LinkedList;

import controller.ControllerModel;
import model.Pelicula;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
	
	private ControllerModel controller;
	PImage breakingbad;
	PImage dark;
	PImage mindhunter;
	PImage ozark;
	PImage startrek;
	PImage strangerthings;
	PImage theirishman;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PApplet.main("view.Main");

	}
	
	public void settings() {
		size(600,500);
		
	}
	
	public void setup() {
		controller = new ControllerModel(this);
		controller.crear();

	}
	
	public void draw() {
		background(0);
		
		for (int i = 0; i < controller.peliculas().size(); i++) {
			controller.peliculas().get(i).dibujar((50 * i));
		}

	}
	
	public void mousePressed() {
		

		controller.cargar(0);

	}
	

}
