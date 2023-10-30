package servicos;

import java.time.Duration;

import entidades.Aluguel;
import entidades.Boleto;

public class ServicoGerarBoleto {
	
	private Double valorDiaria;
	private ServicoTaxa servicoTaxa;
	
	public ServicoGerarBoleto(Double valorDiaria, ServicoTaxa servicoTaxa) {
		this.valorDiaria = valorDiaria; 
		this.servicoTaxa = servicoTaxa;
	}
	
	public void processarBoleto(Aluguel aluguel) {
		Duration tempo = Duration.between(aluguel.getEntrada().atStartOfDay(),aluguel.getSaida().atStartOfDay());
		Long dias = tempo.toDays();
		double taxaDiaria = servicoTaxa.calculaTaxa(valorDiaria);
		double taxaTotal = taxaDiaria * dias;
		double valorTotal = (valorDiaria * dias) + taxaTotal;
		aluguel.setBoleto(new Boleto(taxaTotal, valorTotal)); 
	}
}
