package ejercicio_4_9_Operador_insteanceof;

public class Ortopedista extends Medico {

	enum tipologia {
		MAXILOFACIAL, PEDIÁTRICA
	};

	tipologia tipo;

	void setTipologia(tipologia tipo) {
		this.tipo = tipo;
	}

	tipologia getTipologia() {
		return tipo;
	}

}
