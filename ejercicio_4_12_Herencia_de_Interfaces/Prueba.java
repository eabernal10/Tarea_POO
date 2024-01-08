package ejercicio_4_12_Herencia_de_Interfaces;

public class Prueba {

	public static void main(String[] args) {

		PartidoFutbolLigaEspanola partido = new PartidoFutbolLigaEspanola();
		System.out.println("Duracion del partido = " + PartidoFutbolLigaEspanola.duracionPartidoFutbol);
		partido.setEquipoLocal("Real Madrid");
		partido.setEquipoVisitante("Barcelona");
		partido.setGolesEquipoLocal(3);
		partido.setGolesEquipoVisitante(3);
		partido.imprimirMarcador();

		//Ejercicio propuesto
		System.out.println("");
		PartidoBaloncestoLigaColombiana partidoBaloncesto = new PartidoBaloncestoLigaColombiana();
		System.out.println("Duracion del partido= " + PartidoBaloncestoLigaColombiana.duracionPartidoBaloncesto);
		partidoBaloncesto.setEquipoLocal("Cafeteros");
		partidoBaloncesto.setEquipoVisitante("Team Cali");
		partidoBaloncesto.setCestasEquipoLocal(35);
		partidoBaloncesto.setCestasEquipoVisitante(20);
		partidoBaloncesto.imprimirMarcador();
				
	}

}
