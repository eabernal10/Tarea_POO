package ejercicio_4_11_interfaces_multiples;

public class Prueba {

	public static void main(String args[]) {
		
		Terrestre camioneta = new Terrestre(100, 250);
		System.out.println("Camioneta");
		camioneta.imprimir();
		camioneta.acelerar(50);
		System.out.println("Nueva Velocidad actual= " + camioneta.velocidadActual);
		Acuatico motoAcuatica = new Acuatico(50, 110);
		System.out.println("Moto acuatica");
		motoAcuatica.imprimir();
		System.out.println("Revoluciones del motor = " + motoAcuatica.calcularRevolucionesMotor(1200, 2));
		motoAcuatica.recomendarVelocidad(20);
		
		//ejercicio propuesto
		
		VehiculoAereo avion = new VehiculoAereo();
		System.out.println("");
		System.out.println("---Avion---");
		avion.despegar();
		avion.volar();
		avion.aterrizar();
		System.out.println("Avion: " + avion.soltar());
		System.out.println("Avion: " + avion.subirTrenAterrizaje());
		System.out.println("Avion: " + avion.encender());
		System.out.println("Avion: " + avion.apagar());
	}

}
