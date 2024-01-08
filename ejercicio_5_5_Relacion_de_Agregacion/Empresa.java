package ejercicio_5_5_Relacion_de_Agregacion;

public class Empresa extends Cliente {

	private String razonSocial;
	private String nit;

	public Empresa(String nombre, String telefono, String direccion, String razonSocial, String nit) {
		super(nombre, telefono, direccion);
		this.razonSocial = razonSocial;
		this.nit = nit;
	}

}
