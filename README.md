# 12ABDGrupo2DataOPS
Repositorio para aula de Data OPS da turma 12ABD da FIAP

# Referencias interessantes

By Diogo Hikaru Nomura

Framework de Versionamento: https://www.gitflow.com/

Branch Model: https://nvie.com/posts/a-successful-git-branching-model/

Introdução ao GitFlow: https://vimeo.com/16018419

Mais um Site legal sobre Git: https://www.atlassian.com/br/git/tutorials/comparing-workflows/gitflow-workflow

Git Flow Cheat Sheet: http://https://danielkummer.github.io/git-flow-cheatsheet/

# Modelo Entidade Relacionamento SalesLT

![alt text](https://github.com/dhnomura/12ABDGrupo2DataOPS/blob/main/assessment/SalesLT_ER.png?raw=true_)

# Branchs

**Branch Master** -> Produtivo

**Branch Feature** -> Ambiente de Desenvolvimento

**Branch Projeto Aula 2** -> Entregaveis da Aula

# Data Ops Entregas Aula 2

Gerar datasets, um com dados agregados para um relatório de negócios, e um dataset para o time de ciencia de Dados realizar exploração dos dados;

1. O Relatório é para a àrea de Vendas:
	-	Este relatório deve conter dados diários
	-	Informações de valores de venda por Região
	-	Informações de valores de Venda Online e Offline

2. O Dataset para exploração para ciência de Dados:
	-	Objetivo de construir um modelo de previsão de Churn
	-	A solicitação é de uma amostra de dados com informações da entidades de Cliente, Produtos, Vendas e Vendedores.

# Data Pipe lines

1. Pipe line com dados agregados de vendas para relatório de negócio

![alt text](https://github.com/dhnomura/12ABDGrupo2DataOPS/blob/ProjetoAula02/DocumentacaoTalend/RelatorioVendas.PNG)

2. O Dataset para exploração para ciência de Dados

	-	Entidate Clientes
		![alt text](https://github.com/dhnomura/12ABDGrupo2DataOPS/blob/ProjetoAula02/DocumentacaoTalend/IngestaoCustomer.PNG?raw=true)

	-	Entidade Produtos
		![alt text](https://github.com/dhnomura/12ABDGrupo2DataOPS/blob/ProjetoAula02/DocumentacaoTalend/IngestaoProduto.PNG?raw=true)

	-	Entidade Vendas
		![alt text](https://github.com/dhnomura/12ABDGrupo2DataOPS/blob/ProjetoAula02/DocumentacaoTalend/IngestaoSales.PNG?raw=true)

	-	Entidade Vendedores
		![alt text](https://github.com/dhnomura/12ABDGrupo2DataOPS/blob/ProjetoAula02/DocumentacaoTalend/IngestaoSalesPerson.PNG?raw=true)

# Estrutura de diretórios do HDFS

1. **RAW** - Tem como objetivo ser uma landing Zone, são dados raws, os quais são recebidos de acordo com a sua origem.

2. **Harmonized** - São dados que possuém algum tipo de tratamento, harmonização, os quais melhoram a qualidade do dado.

3. **Curated** - São dados prontos para o consumo.

# Harmonizações

1.	**Customer**
	-	**Coluna Title** 		- Removido valores Nulos;
					 		- Convertido abreviações latinas para inglesa, como Sr -> Mr;
	-	**Coluna Midlewname**	- Garantir trabalhar apenas com abreviações do segundo nome;	
	-	**Coluna SalesPerson**	- Removido o prefixo da base de dados;
	-	**Coluna Phone**		- Removido o prefixo do país.

	![alt text](https://github.com/dhnomura/12ABDGrupo2DataOPS/blob/ProjetoAula02/DocumentacaoTalend/CustomerHarmonized.PNG?raw=true)

# Dados Curados

1.	**Relatório de Vendas**
	-	**AggregateTotalOnline<date>.csv**	- Agregação do total de vendas Online / Offline;
	-	**AggregateTotalRegion<date>.csv**  - Agregação do total de vendas por região.

2. 	Ciencia de dados modelo Churn
	-	**ChrunCustomerCurated<date>.csv** 	- Desnormalização de clientes;
	-	**ChrunSalesPerson<date>.csv**		- Desnormalização de Vendedores;
	-	**ChrunSalesCurate<date>.csv**		- Desnormalização de Vendas;
	-	**ChrunProductCurate<date>.csv**	- Desnormalização de Produtos.