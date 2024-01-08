package ejercicio_5_5_Relacion_de_Agregacion;

public class Prueba {

	public static void main(String[] args) {
		
		//Ejercicio Propuesto
		Empresa empresaCliente = new Empresa("EmpresaXYZ", "123456789", "Calle Empresa 123", "RazonSocial123", "NIT123");
        ClienteParticular clienteParticular = new ClienteParticular("Juan", "Perez", "123456789", "987654321", "Calle Particular 456");
		
		Producto producto1 = new Producto(1, "Carpeta", "Carpeta anillada metalica", 1000);
		Producto producto2 = new Producto(2, "Tinta", "Tinta china de color negro.", 3000);
		Producto producto3 = new Producto(3, "Cinta pegante", "Cinta adhesiva de color transparente.", 800);
		Producto producto4 = new Producto(4, "Cartulina", "Pliego de cartulina 60x40 cms.", 600);
		Orden orden = new Orden(1, empresaCliente);
		orden.anadirItem(1, 5, producto1);
		orden.anadirItem(2, 3, producto2);
		orden.anadirItem(3, 2, producto1);
		orden.anadirItem(4, 4, producto4);
		orden.calcularTotalOrden();
		System.out.println(orden);
		
		Orden orden2 = new Orden(2, clienteParticular);
        orden2.anadirItem(3, 2, producto1);
        orden2.calcularTotalOrden();

        System.out.println(orden);
        System.out.println("\n------------------------------\n");
        System.out.println(orden2);
	}

}
