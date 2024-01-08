package ejercicio_5_3_Composicion_con_Partes_Multiples;

import java.util.Vector;

public class Publicacion {

	private String titulo;
    private int anoPublicacion;
    private String editorial;
    Vector<Revista> coleccionRevistas;
    
    public Publicacion(String titulo, int anoPublicacion, String editorial) {
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
        this.editorial = editorial;
        coleccionRevistas = new Vector<Revista>();
    }

    // Métodos getter y setter para atributos comunes
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
	
    void listarRevistas() {
		
		for (int i = 0; i < coleccionRevistas.size(); i++) {

			Revista revista = (Revista) coleccionRevistas.elementAt(i);
			revista.imprimir();
		}
	}
    
    void anadirRevista(Revista revista) {
		coleccionRevistas.add(revista);
	}
}
