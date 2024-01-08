package ejercicio_5_1_Relacion_de_asociacion;


public class Prueba {

	public static void main(String[] args) {
		
		Peaje peaje = new Peaje ("La Lizama", "Santander");
		Camion camion1 = new Camion("PKI-889", 2);
		peaje.anadirVehiculo(camion1);
		peaje.calcularPeaje(camion1);
		Camion camion2 = new Camion("KLM-123", 3);
		peaje.anadirVehiculo(camion2);
		peaje.calcularPeaje(camion2);
		Camion camion3 = new Camion("PQI-234", 4);
		peaje.anadirVehiculo(camion3);
		peaje.calcularPeaje(camion3);
		Moto moto1 = new Moto("ABC-123");
		peaje.anadirVehiculo(moto1);
		peaje.calcularPeaje(moto1);
		Moto moto2 = new Moto("XYZ-000");
		peaje.anadirVehiculo(moto2);
		peaje.calcularPeaje(moto2);
		Carro carro1 = new Carro("WVC-389");
		peaje.anadirVehiculo(carro1);
		peaje.calcularPeaje(carro1);
		Carro carro2 = new Carro("QWE-543");
		peaje.anadirVehiculo(carro2);
		peaje.calcularPeaje(carro2);
		peaje.imprimir();
		
		//ejercicio propuesto
		
		Persona chofer = new Persona("Emilio", "Torres", "02919929", "20/3/1987");
		chofer.asignarVehiculo(camion2);
		
		System.out.println("");
		System.out.println(chofer.toString());
		System.out.println("Total peaje de " + chofer.nombre + ": " + chofer.calcularTotalPeaje());
	}

}
