package ejercicio_5_6_Diferencias_entre_Agregacion_y_Composicion;


public class Defensa extends Jugador {

	public Defensa(String nombre, String apellidos, int edad, boolean esTitular) {
		super(nombre, apellidos, edad, esTitular);
	}

	public String toString() {
		return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", Edad = " + edad;
	}

}
