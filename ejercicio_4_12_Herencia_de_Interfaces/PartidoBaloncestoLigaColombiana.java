package ejercicio_4_12_Herencia_de_Interfaces;

public class PartidoBaloncestoLigaColombiana implements PartidoBaloncesto {

	String equipoLocal;

	String equipoVisitante;

	int cestasEquipoLocal;

	int cestasEquipoVisitante;

	@Override
	public void setEquipoLocal(String nombreEquipo) {
	
		this.equipoLocal = nombreEquipo;
	}

	@Override
	public void setEquipoVisitante(String nombreEquipo) {
		
		this.equipoVisitante = nombreEquipo;
	}

	@Override
	public void setCestasEquipoLocal(int marcador) {
		
		this.cestasEquipoLocal = marcador;
	}

	@Override
	public void setCestasEquipoVisitante(int marcador) {
		
		this.cestasEquipoVisitante = marcador;
	}
	
	void imprimirMarcador() {
		System.out.println(("Equipo local: " + equipoLocal + ": " + cestasEquipoLocal + " - Equipo visitante: "
				+ equipoVisitante + ": " + cestasEquipoVisitante));
	}

	
}
