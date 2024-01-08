package ejercicio_4_8_Metodos_Abstractos;

public class Triangulo extends FiguraGeometrica {

	public double lado1, lado2, lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double calcularArea() {
		
		double base = Math.max(Math.max(lado1, lado2), lado3);
	    double altura = 2 * ((lado1 * lado2 * lado3) / (2 * base));
		
		return (base * altura) / 2;
	}

	@Override
	public double calcularPerimetro() {
		
		return lado1 + lado2 + lado3;
	}
	
	
}
