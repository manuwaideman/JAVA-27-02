package br.com.fiap;

public class TesteFolhaDePagamento {
	
	public static void main(String[] args) {
		FolhaDePagamento fp = new FolhaDePagamento();
		fp.salarioBruto = 5000;
		fp.numeroDeDependentes = 2;
		fp.descontoINSS = 10;
		fp.valorPlanoDeSaude = 50.00;
		
		 System.out.println("Salário liquido: " + fp.calcularSalarioLiquido());
	}

}
