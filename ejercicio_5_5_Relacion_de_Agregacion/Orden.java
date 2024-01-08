package ejercicio_5_5_Relacion_de_Agregacion;

import java.util.*;

public class Orden {

	private int identificador;
	private Vector<LineaPedido> itemsPedido;
	private Cliente cliente;

	public Orden(int identificador, Cliente cliente) {
		this.identificador = identificador;
		itemsPedido = new Vector<LineaPedido>();
		this.cliente = cliente;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int calcularTotalOrden() {
		int totalOrden = 0;
		for (int i = 0; i < itemsPedido.size(); i++) {
			LineaPedido linea = (LineaPedido) itemsPedido.elementAt(i);

			totalOrden = totalOrden + linea.calcularSubtotalLineaPedido();
		}
		return totalOrden;
	}

	public String toString() {
		return "Orden [id = " + identificador + "]\n" + "Items del pedido\n" + itemsPedido + "\nTotal orden = $"
				+ calcularTotalOrden();
	}

	public void anadirItem(int identificador, int cantidad, Producto producto) {

		LineaPedido linea = new LineaPedido(identificador, cantidad, producto);
		itemsPedido.add(linea);
	}
}
