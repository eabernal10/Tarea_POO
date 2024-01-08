package ejercicio_5_6_Diferencias_entre_Agregacion_y_Composicion;

public class Tecnico extends Persona {

	int anosExperiencia;
	boolean esNacional;

	public Tecnico(String nombre, String apellidos, int edad, int anosExperiencia, boolean esNacional) {
		super(nombre, apellidos, edad);
		this.anosExperiencia = anosExperiencia;
		this.esNacional = esNacional;
	}

	public String toString() {
		return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", Edad = " + edad + " Años de experiencia = "
				+ anosExperiencia;
	}
}
