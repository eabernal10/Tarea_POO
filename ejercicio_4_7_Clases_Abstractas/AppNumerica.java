package ejercicio_4_7_Clases_Abstractas;

public class AppNumerica {

	public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(1, 2);
        Fraccion fraccion2 = new Fraccion(3, 4);
        
        System.out.println(fraccion1.toString());
        System.out.println(fraccion1.equals(fraccion2));
        System.out.println(fraccion1.sumar(fraccion2));
        System.out.println(fraccion1.restar(fraccion2));
        System.out.println(fraccion1.multiplicar(fraccion2));
        System.out.println(fraccion1.dividir(fraccion2));
    }
}
