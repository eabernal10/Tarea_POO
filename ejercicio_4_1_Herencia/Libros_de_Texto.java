package ejercicio_4_1_Herencia;

public class Libros_de_Texto extends Libro {

	String curso;
	
	public Libros_de_Texto(String titulo, String autor, float precio, String curso) {
		super(titulo, autor, precio);
		this.curso = curso;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Curso: " + curso);
	}
	
}
