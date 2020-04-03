package model;

import processing.core.PApplet;

public class Pelicula implements Comparable<Pelicula>{
	
	private String nombre, tipo;
	private int anio, rating, posX, posY;
	private PApplet app;
	

	public Pelicula( int anio, String nombre, String tipo, int rating, PApplet app) {
		
		
		this.app=app;	
		this.nombre = nombre;
		this.rating = rating;
		this.tipo = tipo;
		this.anio = anio;
		posX = 30;
	
	}
	
	public void dibujar(int posY) {
		
		app.fill(255);
		app.text(anio, posX,posY+10);
		app.text(nombre, posX +100 , posY+10);
		app.text(tipo,posX+100*2, posY+10);
		app.text(rating, posX+100*3, posY+10);
	
		
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	@Override
	public int compareTo(Pelicula o) {
		// TODO Auto-generated method stub
		return 0;
	}

}