package ejercicio_5_6_Diferencias_entre_Agregacion_y_Composicion;


public class Delantero extends Jugador {

	int golesAnotados;

	public Delantero(String nombre, String apellidos, int edad, boolean esTitular, int golesAnotados) {
		super(nombre, apellidos, edad, esTitular);
		this.golesAnotados = golesAnotados;
	}

	public String toString() {
		return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", Edad = " + edad + ", Goles anotados = "
				+ golesAnotados;
	}
}
