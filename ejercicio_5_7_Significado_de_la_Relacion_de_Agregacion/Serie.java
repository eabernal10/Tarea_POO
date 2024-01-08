package ejercicio_5_7_Significado_de_la_Relacion_de_Agregacion;

public class Serie {

	String titulo;
	String genero;
	String paisOrigen;
	int anoRealizacion;

	public Serie(String titulo, String genero, String paisOrigen, int anoRealizacion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.paisOrigen = paisOrigen;
		this.anoRealizacion = anoRealizacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public int getAnoRealizacion() {
		return anoRealizacion;
	}

	public void setAnoRealizacion(int anoRealizacion) {
		this.anoRealizacion = anoRealizacion;
	}

	@Override
	public String toString() {
		return "Serie: Titulo = " + titulo + ", Genero = " + genero + ", Pais de Origen = " + paisOrigen + ", Ano de Realizacion = "
				+ anoRealizacion;
	}

	
	
}
