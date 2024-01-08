package ejercicio_4_7_Clases_Abstractas;


public class Fraccion extends Numerica {

	int numerador;
	int denominador;
	
	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	@Override
	public String toString() {
	
		return numerador + " / " + denominador;
	}

	@Override
	public boolean equals(Object ob) {
		
		if (this == ob) {
            return true;
        }
        if (ob == null || getClass() != ob.getClass()) {
            return false;
        }
        
        Fraccion fraccion = (Fraccion) ob;
        
        return numerador == fraccion.numerador && denominador == fraccion.denominador;
	}

	@Override
	public Numerica sumar(Numerica numero) {
		
		Fraccion otraFraccion = (Fraccion) numero;
        int numeradorResultado = this.numerador * otraFraccion.denominador + otraFraccion.numerador * this.denominador;
        int denominadorResultado = this.denominador * otraFraccion.denominador;
        return new Fraccion(numeradorResultado, denominadorResultado);
		
	}

	@Override
	public Numerica restar(Numerica numero) {
		
		Fraccion otraFraccion = (Fraccion) numero;
        int numeradorResultado = this.numerador * otraFraccion.denominador - otraFraccion.numerador * this.denominador;
        int denominadorResultado = this.denominador * otraFraccion.denominador;
        return new Fraccion(numeradorResultado, denominadorResultado);
        
	}

	@Override
	public Numerica multiplicar(Numerica numero) {
		
		Fraccion otraFraccion = (Fraccion) numero;
        return new Fraccion(this.numerador * otraFraccion.numerador, this.denominador * otraFraccion.denominador);
        
	}

	@Override
	public Numerica dividir(Numerica numero) {
		
		Fraccion otraFraccion = (Fraccion) numero;
        return new Fraccion(this.numerador * otraFraccion.denominador, this.denominador * otraFraccion.numerador);
        
	}

	
	
}
