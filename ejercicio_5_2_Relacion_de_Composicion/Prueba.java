package ejercicio_5_2_Relacion_de_Composicion;

public class Prueba {

	public static void main(String args[]) {
		Circulo circulo1 = new Circulo(2, 3, 5);
		circulo1.imprimir();

		// Ejercicio Propuesto

		Punto puntoA = new Punto(1, 2);
		Punto puntoB = new Punto(3, 4);
		Recta rectaAB = new Recta(puntoA, puntoB);
		System.out.println("Pendiente de la recta: " + rectaAB.calcularPendiente());
		System.out.println("Longitud de la recta: " + rectaAB.calcularLongitud());

		Punto[] puntosPoligono = { new Punto(0, 0), new Punto(3, 0), new Punto(3, 4) };
		Poligono poligono = new Poligono("Triangulo", puntosPoligono);

		if (poligono.esPoligonoValido()) {
			System.out.println("El poligono " + poligono.nombre + " es valido.");
		} else {
			System.out.println("El poligono " + poligono.nombre + " no es valido.");
		}
	}

}
