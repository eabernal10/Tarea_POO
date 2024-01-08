package ejercicio_4_1_Herencia;


public class LibroTextoUColombia extends Libros_de_Texto {

	String facultad;
	
	public LibroTextoUColombia(String titulo, String autor, float precio, String curso, String facultad) {
		super(titulo, autor, precio, curso);
		this.facultad = facultad;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Facultad: " + facultad);
	}

}
