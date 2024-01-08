package ejercicio_4_8_Metodos_Abstractos;

public class AppFiguraGeometrica {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo(30,50);
		Rectangulo rectangulo = new Rectangulo(10,20);
		Cuadrado cuadrado = new Cuadrado(40);
		Triangulo triangulo = new Triangulo(10,20,30);
		TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(30, 60, 90);
		
		System.out.println("Area Circulo: " + circulo.calcularArea());
		System.out.println("Perimetro Circulo: " + circulo.calcularPerimetro());
		System.out.println("");
		System.out.println("Area Rectangulo: " + rectangulo.calcularArea());
		System.out.println("Perimetro Rectangulo: " + rectangulo.calcularPerimetro());
		System.out.println("");
		System.out.println("Area Cuadrado: " + cuadrado.calcularArea());
		System.out.println("Perimetro Cuadrado: " + cuadrado.calcularPerimetro());
		System.out.println("");
		System.out.println("Area Triangulo: " + triangulo.calcularArea());
		System.out.println("Perimetro Triangulo: " + triangulo.calcularPerimetro());
		System.out.println("");
		System.out.println("Area Triangulo Rectangulo: " + trianguloRectangulo.calcularArea());
		System.out.println("Perimetro Triangulo Rectangulo: " + trianguloRectangulo.calcularPerimetro());
	
	}

}
