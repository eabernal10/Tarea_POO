package ejercicio_5_4_Composicion_Multiple;

public class Prueba {

	public static void main(String[] args) {

		Carro carro = new Carro(2, tipoChasis.MONOCASCO, "Rojo", tipoCarroceria.TUBULAR, "Goodyear", 25, 20, 15,
				"Cuero", true, tipoAsiento.Conductor, 2, tipoAirbag.Trasero, false, 4, "Arriba", true, "Abiertos", true, "Cerrado");
		carro.imprimir();

	}

}
