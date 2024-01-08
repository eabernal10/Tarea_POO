package ejercicio_5_3_Composicion_con_Partes_Multiples;

public class Revista extends Publicacion {

	String nombre;
	int anoPublicacion;
	String periodicidad;
	String editorial;
	String pais;
	
	public Revista(String nombre, int anoPublicacion, String periodicidad, String editorial, String pais) {
		super(pais, anoPublicacion, pais);
		this.nombre = nombre;
		this.anoPublicacion = anoPublicacion;
		this.periodicidad = periodicidad;
		this.editorial = editorial;
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	void imprimir() {
		System.out.println("Nombre de la revista = " + nombre);
		System.out.println("Ano de publicacion = " + anoPublicacion);
		System.out.println("Periodicidad: " + periodicidad);
		System.out.println("Editorial = " + editorial);
		System.out.println("Pais = " + pais);
	}
	
}
