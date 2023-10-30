package servicos;

public class ServicoTaxaMarAzul implements ServicoTaxa{

	@Override
	public double calculaTaxa(double valorDiaria) {
		double taxa = (valorDiaria * 0.02) + 15.00;
		return taxa;
	}
}
