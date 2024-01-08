package ejercicio_4_11_interfaces_multiples;

public class Acuatico extends Vehiculo implements Motor, Vela {

	public Acuatico(int velocidadActual, int velocidadMaxima) {

		super(velocidadActual, velocidadMaxima);
	}

	void acelerar(int velocidad) {
		int vel = velocidadActual + velocidad;
		if (vel > velocidadMaxima) {
			System.out.println("Supera la velocidad máxima permitida");
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

	public void recomendarVelocidad(int velocidadViento) {
		if (velocidadViento > 80 || velocidadViento < 10) {
			velocidadActual = 0;
		}
	}
}
