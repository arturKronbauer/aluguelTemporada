package servicos;

public class ServicoTaxaParaiso implements ServicoTaxa{

	@Override
	public double calculaTaxa(double valorDiaria) {
		double taxa = (valorDiaria * 0.05) + 10.00;
		return taxa;
	}
}
