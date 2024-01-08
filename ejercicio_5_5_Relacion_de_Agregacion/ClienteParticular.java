package ejercicio_5_5_Relacion_de_Agregacion;

public class ClienteParticular extends Cliente {

	 private String apellidos;
	    private String numeroDocumento;

	    public ClienteParticular(String nombre, String apellidos, String numeroDocumento, String telefono, String direccion) {
	        super(nombre, telefono, direccion);
	        this.apellidos = apellidos;
	        this.numeroDocumento = numeroDocumento;
	    }
}
