package ejercicio_5_3_Composicion_con_Partes_Multiples;

public class Prueba {

	public static void main(String args[]) {
		Biblioteca biblioteca1 = new Biblioteca("Biblioteca Nacional");
		Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 1967, "Sudamericana", "858.67/M566");
		biblioteca1.anadirLibro(libro1);
		Libro libro2 = new Libro("Rayuela", "Julio Cortazar", 1963, "Sudamericana", "863.55/J667");
		biblioteca1.anadirLibro(libro2);
		Libro libro3 = new Libro("La tia julia y el escribidor", "Mario Vargas Llosa", 1977, "Seix Barral", "868.23/L567");
		biblioteca1.anadirLibro(libro3);
		biblioteca1.listarLibros();
		
		//Ejercicio Propuesto
		Publicacion publicacion1 = new Publicacion("El amazonas", 2016, "Vistazo");
		Revista revista1 = new Revista("Explorando la isla", 2011, "Semanal", "Vistazo", "Colombia");
		publicacion1.anadirRevista(revista1);
		Revista revista2 = new Revista("Cocinando con Samuel", 2013, "Diaria", "Vistazo", "Colombia");
		publicacion1.anadirRevista(revista2);
		publicacion1.listarRevistas();
	}

}
