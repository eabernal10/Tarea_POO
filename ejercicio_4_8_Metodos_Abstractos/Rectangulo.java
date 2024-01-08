package ejercicio_4_8_Metodos_Abstractos;

public class Rectangulo extends FiguraGeometrica {

	public double longitud;
	public double anchura;

	public Rectangulo(double longitud, double anchura) {
		super();
		this.longitud = longitud;
		this.anchura = anchura;
	}

	@Override
	public double calcularArea() {
		
		return longitud * anchura;
	}

	@Override
	public double calcularPerimetro() {
		
		return 2 * (longitud + anchura);
	}

}
