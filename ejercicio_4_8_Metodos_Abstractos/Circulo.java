package ejercicio_4_8_Metodos_Abstractos;

public class Circulo extends FiguraGeometrica {

	public double radio;
	public double diametro;
	
	public Circulo(double radio, double diametro) {
		super();
		this.radio = radio;
		this.diametro = diametro;
	}

	@Override
	public double calcularArea() {

		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public double calcularPerimetro() {
		
		return 2 * Math.PI * radio;
	}
	
}
