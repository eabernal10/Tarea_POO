package ejercicio_4_2_Paquetes_y_MetodosdeAcceso;

public class Gato extends Mascota {

	String tipoPelo;
	String raza;
	double alturaSalto;
	double longitudSalto;

	public Gato(String nombre, int edad, String color, String tipoPelo, String raza, double alturaSalto,
			double longitudSalto) {
		super(nombre, edad, color);
		this.tipoPelo = tipoPelo;
		this.raza = raza;
		this.alturaSalto = alturaSalto;
		this.longitudSalto = longitudSalto;
	}

	public static void sonido() {
		System.out.println("Los gatos maullan y ronronean");
	}

	@Override
	public String toString() {
		return "Tipo de Pelo = " + tipoPelo + ", Raza = " + raza + ", Altura de Salto = " + alturaSalto + " cm"
				+ ", Longitud de Salto = " + longitudSalto + " cm" +  ", Nombre = " + nombre + ", Edad = " + edad + ", Color = "
				+ color;
	}

}
