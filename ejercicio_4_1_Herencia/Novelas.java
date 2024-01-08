package ejercicio_4_1_Herencia;

public class Novelas extends Libro{

	String tipo;
	
	public Novelas(String titulo, String autor, float precio, String tipo) {
		super(titulo, autor, precio);
		this.tipo = tipo;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Tipo: " + tipo);
	}
	
	
}
