Observação

Todas as classes solicitadas no exercício devem estar de acordo com os critérios listados abaixo. Estes critérios serão levados em consideração no momento da correção e a supressão ou mau uso deles ocasionará decremento da nota:
a)	Organização: divisão de responsabilidades (cada classe tem a sua responsabilidade).
b)	Coesão: cada objeto é responsável por uma única coisa bem definida. 
c)	Flexibilidade: trabalhar com algo que está dividido em partes é mais flexível do que trabalhar com algo muito grande ou mau dividido.
d)	Reuso: o mesmo objeto pode ser aproveitado em mais de um lugar.
e)	Encapsulamento: princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente.
f)	Delegação: tudo que uma classe deve prover deve estar dentro da classe.
g)	Wrapper Classe: se beneficiar das propriedades que os objetos proporcionam em relação aos tipos primitivos.
h)	Herança: Relação "é-um“. Generalização/Especialização. Superclasse (classe base) / subclasse (classe derivada)
i)	Polimorfismo: a associação do tipo específico com o tipo genérico é feita em tempo de execução (upcasting).
j)	Interfaces: para criar sistemas com baixo acoplamento e flexíveis.
k)	Inversão de controle: padrão de desenvolvimento que consiste em retirar da classe a responsabilidade de instanciar suas dependências.
l)	Injeção de dependência: é uma forma de realizar a inversão de controle: um componente externo instancia a dependência, que é então injetada no objeto "pai".

Questão
Uma imobiliária possui vários imóveis para alugar por temporada em diferentes condomínios. Para cada imóvel é atribuído um valor por dia e uma taxa de serviço, também calculada diariamente. O valor a ser pago pelo inquilino é o valor da diária, mais a taxa de serviço (que varia de um condomínio para outro), multiplicado pelo número de dias.
Desenvolva um programa para ler os dados da locação: código imóvel, descrição do imóvel, valor da diária, data de entrada e data de saída. Após o programa deve gerar o boleto de pagamento contendo: os dados do imóvel, os dados da locação, o valor total da taxa de serviço e o valor total do pagamento. Siga o exemplo de interação descrito na prova 
Cada condomínio tem uma forma diferente de calcular o valor da taxa de serviço. Vamos utilizar os seguintes cálculos que devem ser implementados no programa:
Condomínio Mar Azul  
taxa = (2% do valor da diária do aluguel + R$ 15,00 de encargos)
Condomínio Paraíso
taxa = (5% do valor da diária do aluguel + R$ 10,00 de encargos)

Cálculos para processar o boleto
taxa total = taxa  * número de diárias
valor total = (valor da diária * número de diárias) + taxa total 

Exemplo de interação
*** Informe os dados da locação: ***
Código do imóvel: 1001
Descrição: Casa 4/4
Valor da Diária: 1000,00
Data Entrada (dd/MM/yyyy): 12/05/2023
Data Saída (dd/MM/yyyy): 15/05/2023

*** Boleto Condomínio Mar Azul ***
Imóvel [Código=1001, Descrição=Casa 4/4]
Aluguel [Entrada=12/05/2023, Saida=15/05/2023]
Boleto [Taxa Total=105.0, Valor Total=3105.0]

