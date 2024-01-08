package ejercicio_4_10_Interfaces;

public class Murcielago extends Mamiferos implements Volador {

	@Override
	public void volar() {
		
		System.out.println("El murcielago vuela");
		
	}

	@Override
	void amamantarCrias() {
		
		System.out.println("El murcielago amamanta sus crias");
		
	}

}
