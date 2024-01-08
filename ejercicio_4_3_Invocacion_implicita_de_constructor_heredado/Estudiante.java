package ejercicio_4_3_Invocacion_implicita_de_constructor_heredado;

public class Estudiante extends Persona {

	public String carrera;
	public int semestre;
	
	public Estudiante(String nombre, String direccion, String carrera, int semestre) {
		super(nombre, direccion);
		this.carrera = carrera;
		this.semestre = semestre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	
}
