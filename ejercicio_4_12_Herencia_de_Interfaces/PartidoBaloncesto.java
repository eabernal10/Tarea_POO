package ejercicio_4_12_Herencia_de_Interfaces;

public interface PartidoBaloncesto extends MatchDeportivo {

	static final int duracionPartidoBaloncesto = 40;
	
	void setCestasEquipoLocal(int marcador);
	
	void setCestasEquipoVisitante(int marcador);
	
}
