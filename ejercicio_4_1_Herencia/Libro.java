package ejercicio_4_1_Herencia;

public class Libro {

	String titulo;
	String autor;
	float precio;

	public Libro(String titulo, String autor, float precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public void imprimir() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Precio: $" + precio);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
