package ejercicio_4_2_Paquetes_y_MetodosdeAcceso;


public class ApartamentoFamiliar extends Apartamento {

	protected static double valorArea = 2000000;
	protected int valorAdministracion;

	public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int númeroHabitaciones,
			int numeroBanos, int valorAdministracion) {

		super(identificadorInmobiliario, area, direccion, númeroHabitaciones, numeroBanos);
		this.valorAdministracion = valorAdministracion;
	}

	void imprimir() {
		super.imprimir();
		System.out.println("Valor de la administracion = $" + valorAdministracion);
		System.out.println();
	}

}
