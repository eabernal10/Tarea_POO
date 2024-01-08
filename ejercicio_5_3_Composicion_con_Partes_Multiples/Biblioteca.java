package ejercicio_5_3_Composicion_con_Partes_Multiples;

import java.util.Vector;

public class Biblioteca {

	String nombre;

	Vector<Libro> coleccionLibros;
	

	Biblioteca(String nombre) {
		this.nombre = nombre;
		coleccionLibros = new Vector<Libro>();
	}

	void anadirLibro(Libro libro) {
		coleccionLibros.add(libro);
	}

	void listarLibros() {

		for (int i = 0; i < coleccionLibros.size(); i++) {

			Libro libro = (Libro) coleccionLibros.elementAt(i);
			libro.imprimir();
		}
	}
	
	
}
