package ejercicio_5_2_Relacion_de_Composicion;

public class Poligono {

	String nombre;
    Punto[] puntos;

    Poligono(String nombre, Punto[] puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    boolean esPoligonoValido() {
        return puntos != null && puntos.length >= 3;
    }
	
}
