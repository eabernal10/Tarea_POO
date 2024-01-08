package ejercicio_4_10_Interfaces;

public class Prueba {

	public static void main(String[] args) {

		Ballena mobyDick = new Ballena();
		mobyDick.amamantarCrias();
		Ornitorrinco ornitorrinco1 = new Ornitorrinco();
		ornitorrinco1.amamantarCrias();
		ornitorrinco1.ponerHuevos();
		
		//ejercicio propuesto
		
		Murcielago bat = new Murcielago();
		bat.amamantarCrias();
		bat.volar();

	}

}
