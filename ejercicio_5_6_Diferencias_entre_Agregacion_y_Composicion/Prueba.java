package ejercicio_5_6_Diferencias_entre_Agregacion_y_Composicion;


public class Prueba {

	public static void main(String[] args) {

		Tecnico tecnico = new Tecnico("Carlos", "Queiroz", 66, 30, false);

		Portero portero = new Portero("David", "Ospina", 30, true, 10);

		Defensa[] defensas = new Defensa[4];
		MedioCampo[] mediocampos = new MedioCampo[4];
		Delantero[] delanteros = new Delantero[2];
		defensas[0] = new Defensa("Yerry", "Mina", 24, true);
		defensas[1] = new Defensa("Davison", "Sanchez", 23, true);
		defensas[2] = new Defensa("William", "Tesillo", 29, true);
		defensas[3] = new Defensa("Stefan", "Medina", 29, true);
		mediocampos[0] = new MedioCampo("Mateus", "Uribe", 28, true, 12);
		mediocampos[1] = new MedioCampo("Wilmar", "Barrios", 25, true, 12);
		mediocampos[2] = new MedioCampo("Juan Guillermo", "Cuadrado", 31, true, 10);
		mediocampos[3] = new MedioCampo("James", "Rodriguez", 28, true, 32);
		delanteros[0] = new Delantero("Radamel Falcao", "Garcia", 33, true, 15);
		delanteros[1] = new Delantero("Duvan", "Zapata", 28, true, 12);

		EquipoFutbol equipo = new EquipoFutbol("Seleccion mayores", "Colombia", tecnico, portero, defensas, mediocampos,
				delanteros);
		equipo.imprimir();

	}

}
