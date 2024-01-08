package ejercicio_4_9_Operador_insteanceof;

import java.util.Vector;

public class Prueba {

	public static void main(String[] args) {

		Vector listaMedicos = new Vector();
		Medico medico1 = new Medico();
		
		listaMedicos.add(medico1);
		
		Ortopedista ortopedista1 = new Ortopedista();
		listaMedicos.add(ortopedista1);
		
		Pediatra pediatra1 = new Pediatra();
		listaMedicos.add(pediatra1);
		
		for (int i = 0; i < listaMedicos.size(); i++) {

			Medico a = (Medico) listaMedicos.elementAt(i);
			if (a instanceof Ortopedista) {
				System.out.println("El objeto en el indice " + i + " es de la clase Ortopedista");
				continue;
			}

			if (a instanceof Pediatra) {
				System.out.println("El objeto en el indice " + i + " es de la clase Pediatra");
				continue;
			}
			if (a instanceof Medico) {
				System.out.println("El objeto en el indice " + i + " es de la clase Médico");
				continue;
			}
		}
		
		System.out.println("");
		System.out.println("Ejercicio Propuesto");
		//ejercicio propuesto
		
		//Cual es el resultado de la ejecucion del siguiente programa:
		
		int[] arrayInt = new int[5];
		float[] arrayFloat = new float[5];
		Integer[] arrayObjetosInt = new Integer[5];
		System.out.println(arrayInt instanceof Object);
		System.out.println(arrayInt instanceof int[]);
		System.out.println(arrayFloat instanceof Object);
		System.out.println(arrayFloat instanceof float[]);
		System.out.println(arrayObjetosInt instanceof Object);
		System.out.println(arrayObjetosInt instanceof Object[]);
		System.out.println(arrayObjetosInt instanceof Integer[]);
		
		//resultado x7 true
	}

}
