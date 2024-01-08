package ejercicio_5_6_Diferencias_entre_Agregacion_y_Composicion;


public class Portero extends Jugador {

	int golesRecibidos;

	public Portero(String nombre, String apellidos, int edad, boolean esTitular, int golesRecibidos) {
		super(nombre, apellidos, edad, esTitular);
		this.golesRecibidos = golesRecibidos;
	}

	public String toString() {
		return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", Edad = " + edad + ", Goles recibidos = "
				+ golesRecibidos;
	}
}
 