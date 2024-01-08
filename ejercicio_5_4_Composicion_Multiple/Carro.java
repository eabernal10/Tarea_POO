package ejercicio_5_4_Composicion_Multiple;

public class Carro {

	Motor motor;
	Chasis chasis;
	Llanta[] llantas;
	Carroceria carroceria;
	Asiento asiento;
	Airbag airbag;
	FrenosABS frenosABS;
	VidrioElectrico vidrio;
	EspejoElectrico espejo;
	Sunroof sunroof;

	public Carro(int volumen, tipoChasis claseChasis, String color, tipoCarroceria claseCarroceria, String marca,
			int diametro, int altura, int anchura, String tipoMaterial, boolean funda, tipoAsiento tipoAsiento,
			int numAirbag, tipoAirbag tipoAirbag, boolean frenos, int numVidriosElectricos, String posicion,
			boolean espejoElectrico, String estadoEspejo, boolean tieneSunroof, String estadoSunroof) {
		motor = new Motor(volumen);
		chasis = new Chasis(claseChasis);
		llantas = new Llanta[4];
		for (int i = 0; i < llantas.length; i++) {

			llantas[i] = new Llanta(marca, diametro, altura, anchura);
		}

		// ejercicio propuesto
		carroceria = new Carroceria(color, claseCarroceria);
		asiento = new Asiento(tipoMaterial, funda, tipoAsiento);
		airbag = new Airbag(numAirbag, tipoAirbag);
		frenosABS = new FrenosABS(frenos);
		vidrio = new VidrioElectrico(numVidriosElectricos, posicion);
		espejo = new EspejoElectrico(espejoElectrico, estadoEspejo);
		sunroof = new Sunroof(tieneSunroof, estadoSunroof);
	}

	void imprimir() {
		System.out.println("Datos del Carro");
		System.out.println("Motor - Cilindros = " + motor.volumen);
		System.out.println("Chasis - Tipo = " + chasis.tipo);
		System.out.println("Carroceria - Tipo = " + carroceria.tipo + "Color = " + carroceria.color);
		System.out.println("Llantas - Cantidad = " + llantas.length);
		for (int i = 0; i < llantas.length; i++)
			llantas[i].imprimir();
		System.out.println("Tipo Asiento: " + asiento.tipoAsiento);
		System.out.println("Tipo material de asiento: " + asiento.tipoMaterial);
		System.out.println("El asiento tiene funda?: " + asiento.funda);
		System.out.println("Tipo de Airbag: " + airbag.tipoAirbag);
		System.out.println("Cantidad de Airbag: " + airbag.numAirbag);
		System.out.println("El carro tiene sistema de frenos ABS?: " + frenosABS.frenos);
		System.out.println("Cantidad de Vidrios Electricos: " + vidrio.numVidriosElectricos);
		System.out.println("Posicion de Vidrios Electricos: " + vidrio.posicion);
		System.out.println("El carro tiene espejos electricos?: " + espejo.espejoElectrico);
		System.out.println("Estado de los espejos: " + espejo.estadoEspejo);
		System.out.println("El carro tiene Sunroof?: " + sunroof.tieneSunroof);
		System.out.println("Estado del sunroof: " + sunroof.estadoSunroof);
	}
}
