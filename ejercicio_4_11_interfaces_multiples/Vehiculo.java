package ejercicio_4_11_interfaces_multiples;

public abstract class Vehiculo {

	int velocidadActual;
	int velocidadMaxima;

	Vehiculo(int velocidadActual, int velocidadMaxima) {
		this.velocidadActual = velocidadActual;
		this.velocidadMaxima = velocidadMaxima;
	}

	void imprimir() {
		System.out.println("Velocidad actual = " + velocidadActual);
		System.out.println("Velocidad maxima = " + velocidadMaxima);
	}

	abstract void acelerar(int velocidad);

	abstract void frenar(int velocidad);
}
