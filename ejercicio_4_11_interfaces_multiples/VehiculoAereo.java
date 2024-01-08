package ejercicio_4_11_interfaces_multiples;

public class VehiculoAereo implements Reactor, Alas {

	void despegar() {
		System.out.println("Despegando");
	}
	
	void aterrizar() {
		System.out.println("Aterrizando");
	}
	
	void volar() {
		System.out.println("Volando");
	}

	@Override
	public String soltar() {
		
		return "Soltando";
	}

	@Override
	public String subirTrenAterrizaje() {
		
		return "Subiendo Tren de Aterrizaje";
	}

	@Override
	public String encender() {
		
		return "El reactor esta encendido";
	}

	@Override
	public String apagar() {
		
		return "El reactor esta apagado";
	}


	
}
