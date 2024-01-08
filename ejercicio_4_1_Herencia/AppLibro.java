package ejercicio_4_1_Herencia;

public class AppLibro {

	public static void main(String[] args) {
		
		Libro libro =  new Libro("Jurassic Park", "Michael Crichton", 100);
		Libros_de_Texto librosTexto = new Libros_de_Texto("Campanas del Norte", "Jose Mendez", 25, "1ro BGU");
		LibroTextoUColombia librodeColombia = new LibroTextoUColombia("Aprende Colombia", "Enrique Fuentes", 10, "8vo Basica", "Universidad ICESI");
		Novelas novela = new Novelas("Don Quijote", "Miguel de Cervantes", 39, "Aventuras");
		
		libro.imprimir();
		System.out.println("");
		librosTexto.imprimir();
		System.out.println("");
		librodeColombia.imprimir();
		System.out.println("");
		novela.imprimir();
	}

}
