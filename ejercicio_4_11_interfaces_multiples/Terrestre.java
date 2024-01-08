package ejercicio_4_11_interfaces_multiples;

public class Terrestre extends Vehiculo implements Motor {

	Terrestre(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);
	}

	void acelerar(int velocidad) {
		int vel = velocidadActual + velocidad;
		if (vel > velocidadMaxima) {
			System.out.println("Supera la velocidad maxima permitida");
		} else {
			velocidadActual = vel;
		}
	}

	void frenar(int velocidad) {
		int vel = velocidadActual - velocidad;
		if (vel < 0) {
			System.out.println("La velocidad no puede ser negativa");
		} else {
			velocidadActual = vel;
		}
	}

	public int calcularRevolucionesMotor(int fuerza, int radio) {
		return (fuerza * radio);
	}
}
