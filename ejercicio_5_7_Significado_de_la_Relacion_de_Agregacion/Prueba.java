package ejercicio_5_7_Significado_de_la_Relacion_de_Agregacion;

import java.util.Vector;

public class Prueba {

	public static void main(String[] args) {
		Municipio municipio1 = new Municipio("Manizales", 400000, 17, 2200);
		Municipio municipio2 = new Municipio("La Dorada", 98000, 28, 1000);
		Municipio municipio3 = new Municipio("Neira", 30000, 20, 1969);
		Vector<Municipio> municipios = new Vector<Municipio>();
		municipios.add(municipio1);
		municipios.add(municipio2);
		municipios.add(municipio3);
		Departamento departamento = new Departamento("Caldas", municipios);
		System.out.println("El censo del Departamento de " + departamento.getNombre() + " es = "
				+ departamento.calcularCensoPoblaciónDepartamento());
		System.out.println("Municipios con poblacion mayor a 50.000");
		departamento.buscarMunicipioConPoblaciónMayor(50000);
		System.out.println("Búsqueda del municipio de Manizales");
		departamento.buscarMunicipio("Manizales");
	}

}
