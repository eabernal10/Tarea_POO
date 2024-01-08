package ejercicio_4_2_Paquetes_y_MetodosdeAcceso;

public class Perro extends Mascota {

	String tamano;
	String raza;
	double peso;
	boolean muerde;

	public Perro(String nombre, int edad, String color, String tamano, String raza, double peso, boolean muerde) {
		super(nombre, edad, color);
		this.tamano = tamano;
		this.raza = raza;
		this.peso = peso;
		this.muerde = muerde;
	}

	public static void sonido() {
		System.out.println("Los perros ladran");
	}

	@Override
	public String toString() {
		return "Tamano = " + tamano + ", Raza = " + raza + ", Peso = " + peso  + " Kg" + ", Muerde = " + muerde + ", Nombre = "
				+ nombre + ", Edad = " + edad + ", Color = " + color;
	}

}
