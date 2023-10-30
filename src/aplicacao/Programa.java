package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entidades.Aluguel;
import entidades.Imovel;
import servicos.ServicoGerarBoleto;
import servicos.ServicoTaxaMarAzul;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("*** Informe os dados da locação: ***");
		System.out.print("Código do imóvel: ");
		int codigo = sc.nextInt();
		System.out.print("Descrição: ");
		sc.nextLine();
		String descricao = sc.nextLine();
		System.out.print("Valor da Diária: ");
		double valorDiaria = sc.nextDouble();
		System.out.print("Data Entrada (dd/MM/yyyy): ");
		LocalDate entrada = LocalDate.parse(sc.next(), fmt);
		System.out.print("Data Saída (dd/MM/yyyy): ");
		LocalDate saida = LocalDate.parse(sc.next(), fmt);
		
		Imovel imovel = new Imovel(codigo,descricao);
		Aluguel aluguel = new Aluguel(entrada, saida, imovel);
	    
		ServicoGerarBoleto servicoGB = new ServicoGerarBoleto(valorDiaria, new ServicoTaxaMarAzul());
		servicoGB.processarBoleto(aluguel);
		
		System.out.println("");
		System.out.println("*** Boleto Condomínio Mar Azul ***");
		System.out.println(imovel);
		System.out.println(aluguel);
		System.out.println(aluguel.getBoleto());
		sc.close();
	}
}