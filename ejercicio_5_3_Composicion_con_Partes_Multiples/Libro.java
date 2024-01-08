package ejercicio_5_3_Composicion_con_Partes_Multiples;


public class Libro extends Publicacion {

	String titulo;
	String autor;
	int anoPublicacion;
	String editorial;
	String referenciaBibliografica;

	Libro(String titulo, String autor, int anoPublicacion, String editorial, String referenciaBibliografica) {
		super(referenciaBibliografica, anoPublicacion, referenciaBibliografica);
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacion = anoPublicacion;
		this.editorial = editorial;
		this.referenciaBibliografica = referenciaBibliografica;
	}

	void imprimir() {
		System.out.println("Título del libro = " + titulo);
		System.out.println("Autor = " + autor);
		System.out.println("Ano de publicacion = " + anoPublicacion);
		System.out.println("Editorial = " + editorial);
		System.out.println("Referencia bibliográfica = " + referenciaBibliografica);
		System.out.println();
	}

}
