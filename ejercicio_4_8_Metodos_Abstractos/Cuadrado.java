package ejercicio_4_8_Metodos_Abstractos;

public class Cuadrado extends FiguraGeometrica {

	public double lado;

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		
		return lado * lado;
	}

	@Override
	public double calcularPerimetro() {
		
		return 4 * lado;
	}

}
