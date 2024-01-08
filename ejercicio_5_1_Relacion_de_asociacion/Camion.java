package ejercicio_5_1_Relacion_de_asociacion;

public class Camion extends Vehiculo {

	static int valorPeajeEje = 5000;
	
	int numeroEjes;

	Camion(String placa, int numeroEjes) {
		super(placa); 
		this.numeroEjes = numeroEjes;
		}
		
		public int getValorPeajeEje() {
		return valorPeajeEje;
		}
		
		static void setValorPeajeEje(int valorPeajeEje) {
		valorPeajeEje = valorPeajeEje;
		}
		
		void imprimir() {
		
		System.out.println("Placa = " + placa);
		System.out.println("Número de ejes = " + numeroEjes);
		System.out.println("Valor del peaje = " + valorPeajeEje);
		}
	
}
