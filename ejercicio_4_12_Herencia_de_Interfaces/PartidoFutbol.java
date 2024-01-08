package ejercicio_4_12_Herencia_de_Interfaces;

public interface PartidoFutbol extends MatchDeportivo {

	static final int duracionPartidoFutbol = 90;
	
	void setGolesEquipoLocal(int marcador);
	
	void setGolesEquipoVisitante(int marcador);
	
}
