package ejercicio_5_4_Composicion_Multiple;

public class Llanta {

	String marca; 
	int diametroRin; 
	int altura; 
	int anchura; 
	
	Llanta(String marca, int diametroRin, int altura, int anchura) {
		this.marca = marca;
		this.diametroRin = diametroRin;
		this.altura = altura;
		this.anchura = anchura;
		}
		
		void imprimir() {
		System.out.println("Marca = " + marca);
		System.out.println("Diametro del rin = " + diametroRin);
		System.out.println("Altura = " + altura);
		System.out.println("Anchura = " + anchura);
		}
	
}
