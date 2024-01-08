package ejercicio_4_5_Conversion_descendente;


public class Prueba2 {

	public static void main(String[] args) {
		
		ProfesorTitular objeto = (ProfesorTitular) new Profesor();
		objeto.imprimir();
	}
	
	//Ejercicio propuesto
	
	Profesor profesor1 = new ProfesorTitular();
	ProfesorTitular profesor2 = (ProfesorTitular) profesor1;
	//profesor2.imprimir();
	
}
