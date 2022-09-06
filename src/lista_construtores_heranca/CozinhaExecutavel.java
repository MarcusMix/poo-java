package lista_construtores_heranca;

public class CozinhaExecutavel extends Eletrodomestico{

	public static void main(String[] args) {
		Geladeira g1 = new Geladeira("Frost free", "Brastemp", 50 , 90);
		Fogao f1 = new Fogao("Super quente", "Electrolux", 6, 87);
		Lava_loucas l1 = new Lava_loucas("Grandux", "Trisol", 40, 98);
		Micro_ondas m1 = new Micro_ondas("Microx", "Fogarel", 20, 250);
		Lavadora_roupas lp1 = new Lavadora_roupas("Roupexy", "PopUp09", 200, 580);
		
//		cozinha [] listaCozinha = {g1, f1, l1, m1, lp1};
		
		double consumoGeladeiraMes = g1.calcularConsumo();
		double consumoGeladeiraDias = g1.calcularConsumo(10);
	
		double consumoFogaoMes = f1.calcularConsumo();
		double consumoFogaoDia = f1.calcularConsumo(10);
		
		double consumoLavaLoucasMes = l1.calcularConsumo();
		double consumoLavaLoucasDias = l1.calcularConsumo(10);
		
		
		double Micro_ondasMes = m1.calcularConsumo();
		double Micro_ondasDia = m1.calcularConsumo(10);
		
		
		double Lavadora_roupasMes = lp1.calcularConsumo();
		double Lavadora_roupasDias = lp1.calcularConsumo(10);
		
		
		double consumoTotalMes = consumoGeladeiraMes + consumoFogaoMes + consumoLavaLoucasMes +  Micro_ondasMes + Lavadora_roupasMes;
		
		double consumoTotal10Dias = consumoGeladeiraDias + consumoFogaoDia + consumoLavaLoucasDias + Micro_ondasDia + Lavadora_roupasDias;
		
		
		System.out.println("O consumo da Cozinha por mes �: " + consumoTotalMes + "Kw.");
		System.out.println("Consumo da Cozinha em 10 dias �: " + consumoTotal10Dias + "Kw.");
		
	}

}
