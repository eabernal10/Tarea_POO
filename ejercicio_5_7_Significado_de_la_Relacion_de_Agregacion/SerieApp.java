package ejercicio_5_7_Significado_de_la_Relacion_de_Agregacion;

import java.util.Vector;

public class SerieApp {

	public static void main(String[] args) {
		
		Serie serie1 = new Serie("El Encuentro", "Accion", "Estados Unidos", 2015);
		Serie serie2 = new Serie("Sofia", "Documental", "Argentina", 2022);
		Serie serie3 = new Serie("Samurai", "Ciencia-Ficcion", "Japon", 1946);
		Vector<Serie> series = new Vector<Serie>();
		System.out.println("Agregando Series...");
		series.add(serie1);
		series.add(serie2);
		series.add(serie3);
		System.out.println("Series Agregadas con Exito!");
		System.out.println(serie1.toString());
		System.out.println(serie2.toString());
		System.out.println(serie3.toString());
		System.out.println("Eliminando Serie seleccionada...");
		series.remove(2);
		System.out.println("Serie Eliminada con Exito! Mostrando series disponibles...");
		System.out.println(series);
		System.out.println("Consultando Serie Seleccionada...");
		System.out.println("Resultado: " + serie1);
	}

}
