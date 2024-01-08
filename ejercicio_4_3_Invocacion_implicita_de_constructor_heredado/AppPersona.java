package ejercicio_4_3_Invocacion_implicita_de_constructor_heredado;

public class AppPersona {

	public static void main(String[] args) {
		
		Estudiante estudiante = new Estudiante("Gabriel Barbosa", "Rosario", "TI", 3);
		Profesor profesor = new Profesor("Ramon Velez", "Sao Paulo", "Contabilidad", "Magister");
		
		System.out.println("Estudiante nombre: " + estudiante.nombre);
		System.out.println("Estudiante direccion: " + estudiante.direccion);
		System.out.println("Estudiante carrera: " + estudiante.carrera);
		System.out.println("Estudiante semestre: " + estudiante.semestre);
		System.out.println("");
		System.out.println("Profesor nombre: " + profesor.nombre);
		System.out.println("Profesor direccion: " + profesor.direccion);
		System.out.println("Profesor departamento: " + profesor.departamento);
		System.out.println("Profesor categoria: " + profesor.categoria);

	}

}
