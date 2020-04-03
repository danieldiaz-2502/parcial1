package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Model {
	private String[] info;
	private String[] info2;
	private String[] infoPeliculas;
	private String[] infoPeliculas2;
	private String nombre, tipo;
	private int anio, rating;
	private LinkedList<Pelicula> peliculas;
	private PApplet app;

	public Model(PApplet app) {

		this.app = app;
		peliculas = new LinkedList<Pelicula>();
		info = app.loadStrings("data/netflix.txt");
		info2 = app.loadStrings("data/netflix 2.txt");
	}

	public void crear() {

		for (int i = 0; i < info.length; i++) {
			infoPeliculas = info[i].split(",");
			nombre = infoPeliculas[0];
			anio = Integer.parseInt(infoPeliculas[1]);
			rating = Integer.parseInt(infoPeliculas[2]);
			tipo = infoPeliculas[3];

			for (int j = 0; j < info2.length; j++) {
				
				infoPeliculas2 = info2[j].split(",");

				if (tipo == infoPeliculas2[1]) {

					peliculas.add(new Pelicula(anio, nombre, tipo, rating, app));
				}
			}

		}

	}

	public void cargar(int numero) {

		switch (numero) {

		case 0:
			
			Collections.sort(peliculas);

			for (int i = 0; i < peliculas.size(); i++) {
				
				String nombre = peliculas.get(i).getNombre();
				String tipo = peliculas.get(i).getTipo();
				String anio = Integer.toString(peliculas.get(i).getAnio());
				String rating = Integer.toString(peliculas.get(i).getRating());

			}

		}

	}

	public LinkedList<Pelicula> getPelicula() {
		return peliculas;
	}

	public void setPerros(LinkedList<Pelicula> pelicula) {
		this.peliculas = pelicula;
	}

	

}