package ejercicio_4_2_Paquetes_y_MetodosdeAcceso;


public class CasaUrbana extends Casa {

	public CasaUrbana(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones,
			int numeroBanos, int numeroPisos) {

		super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
	}

	void imprimir() {
		super.imprimir();
	}
	
}
