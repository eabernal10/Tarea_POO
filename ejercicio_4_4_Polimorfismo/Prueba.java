package ejercicio_4_4_Polimorfismo;

public class Prueba {

	public static void main(String[] args) {

		Profesor profesor1 = new ProfesorTitular();
		profesor1.imprimir();

		//Ejercicio Propuesto
		// ¿Cuál es el resultado de la ejecución del siguiente programa basado
		//en el ejercicio anterior?
		
		Profesor profesor = new ProfesorTitular();
		Profesor profesor2 = (Profesor) profesor;
		profesor2.imprimir();

		//Resultado: Es un profesor titular.
		
	}

}
