package lista_contrutores_heranca2;

public class Serra extends FerramentasEletricas {

	public Serra() {
		super();
	}

	public Serra(String modelo, String fabricante, double rpm, double potencia, double tensao, double peso,
			double fatorDeDesgaste) {
		super(modelo, fabricante, rpm, potencia, tensao, peso, fatorDeDesgaste);
	}
}
