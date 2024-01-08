package ejercicio_5_4_Composicion_Multiple;

public class Asiento {

	String tipoMaterial;
	boolean funda;
	tipoAsiento tipoAsiento;
	
	public Asiento(String tipoMaterial, boolean funda, tipoAsiento tipoAsiento) {
		super();
		this.tipoMaterial = tipoMaterial;
		this.funda = funda;
		this.tipoAsiento = tipoAsiento;
	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public boolean isFunda() {
		return funda;
	}

	public void setFunda(boolean funda) {
		this.funda = funda;
	}

	public tipoAsiento getTipoAsiento() {
		return tipoAsiento;
	}

	public void setTipoAsiento(tipoAsiento tipoAsiento) {
		this.tipoAsiento = tipoAsiento;
	}
	
}
