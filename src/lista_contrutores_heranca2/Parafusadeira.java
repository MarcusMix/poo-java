package lista_contrutores_heranca2;

public class Parafusadeira extends FerramentasEletricas {

	public Parafusadeira() {
		super();
	}

	public Parafusadeira(String modelo, String fabricante, double rpm, double potencia, double tensao, double peso,
			double fatorDeDesgaste) {
		super(modelo, fabricante, rpm, potencia, tensao, peso, fatorDeDesgaste);
	}
}
