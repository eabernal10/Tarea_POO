package ejercicio_4_2_Paquetes_y_MetodosdeAcceso;

public class TiendaMascotas {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro("Nicolas", 5, "Cafe", "Pequeno", "Chihuahua", 25, true);
		Perro perro2 = new Perro("Rocky", 12, "Negro", "Mediano", "Bulldog", 75, false);
		Perro perro3 = new Perro("Chispitas", 6, "Blanco", "Grande", "Pastor Aleman", 60, true);
		
		Gato gato1 = new Gato("Mimi", 3, "Piel", "Gato sin Pelo", "Esfinge", 2, 1);
		Gato gato2 = new Gato("Clyde", 5, "Negro", "Gato de pelo largo", "Angora", 50, 100);
		Gato gato3 = new Gato("Peluso", 2, "Gris", "Gato de pelo corto", "Britanico", 30, 90);
		
		System.out.println("---Perros---");
		System.out.println(perro1.toString());
		System.out.println(perro2.toString());
		System.out.println(perro3.toString());
		Perro.sonido();
		System.out.println("");
		System.out.println("---Gatos---");
		System.out.println(gato1.toString());
		System.out.println(gato2.toString());
		System.out.println(gato3.toString());
		Gato.sonido();
	}

}
