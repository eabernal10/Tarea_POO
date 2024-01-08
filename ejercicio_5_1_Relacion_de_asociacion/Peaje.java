package ejercicio_5_1_Relacion_de_asociacion;

import java.util.Vector;

public class Peaje {

	String nombre;

	String departamento;

	Vector<Vehiculo> vehiculos;

	int totalPeaje = 0;

	static int totalCamiones = 0;

	static int totalMotos = 0;

	static int totalCarros = 0;

	Peaje(String nombre, String departamento) {
		this.nombre = nombre;
		this.departamento = departamento;
		vehiculos = new Vector<Vehiculo>();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	private void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void anadirVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}

	public int calcularPeaje(Vehiculo vehiculo) {
		if (vehiculo instanceof Carro) {
			totalCarros++;
			totalPeaje += Carro.valorPeaje;
			return Carro.valorPeaje;
		} else if (vehiculo instanceof Moto) {
			totalMotos++;
			totalPeaje += Moto.valorPeaje;
			return Moto.valorPeaje;
		} else if (vehiculo instanceof Camion) {
			totalCamiones++;
			Camion camion = (Camion) vehiculo;
			totalPeaje += camion.numeroEjes * camion.valorPeajeEje;
			return camion.numeroEjes * camion.valorPeajeEje;
		} else
			return -1;
	}
	
	public void imprimir() {
		System.out.println("Peaje = " + getNombre());
		System.out.println("Ubicacion = " + getDepartamento());
		System.out.println("Total de carros = " + totalCarros);
		System.out.println("Total de motos = " + totalMotos);
		System.out.println("Total de camiones = " + totalCamiones);
		int totalVehiculos = totalCarros + totalMotos +totalCamiones;
		System.out.println("Total de vehículos = " + totalVehiculos);
		System.out.println("Dinero total = $" + totalPeaje);
		}
}
