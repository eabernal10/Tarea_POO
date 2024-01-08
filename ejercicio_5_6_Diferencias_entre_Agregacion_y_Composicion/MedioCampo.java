package ejercicio_5_6_Diferencias_entre_Agregacion_y_Composicion;


public class MedioCampo extends Jugador {

	int numeroAsistencias;

	public MedioCampo(String nombre, String apellidos, int edad, boolean esTitular, int numeroAsistencias) {
		super(nombre, apellidos, edad, esTitular);
		this.numeroAsistencias = numeroAsistencias;
	}

	public String toString() {
		return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", Edad = " + edad + ", Asistencias = "
				+ numeroAsistencias;
	}

}
