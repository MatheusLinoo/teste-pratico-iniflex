Teste Prático – Gestão de Funcionários (Iniflex)
Este projeto é uma solução em Java para um desafio de programação que envolve a criação e manipulação de uma lista de funcionários. O sistema realiza diversas operações como inserção, remoção, cálculo de salários, agrupamento por função e exibição de dados formatados.

📜 Descrição
O objetivo principal é demonstrar o uso de conceitos fundamentais e avançados da linguagem Java, incluindo Programação Orientada a Objetos (POO), manipulação de coleções, uso da API de Streams para processamento de dados e o tratamento de datas e valores monetários com precisão.

O fluxo principal da aplicação, contido na classe Principal, executa as seguintes tarefas em sequência:

Criação e Inserção: Instancia e insere um conjunto de funcionários em uma lista.

Remoção: Remove um funcionário específico ("João") da lista.

Aumento Salarial: Aplica um aumento de 10% no salário de todos os funcionários.

Agrupamento: Agrupa os funcionários por sua função em um Map.

Filtragem: Exibe os funcionários que fazem aniversário em outubro e dezembro.

Cálculos e Ordenação:

Encontra o funcionário com a maior idade.

Ordena a lista de funcionários por ordem alfabética.

Calcula e exibe a soma total dos salários.

Calcula quantos salários mínimos cada funcionário recebe.

✨ Funcionalidades
Cadastro de Funcionários: Representação de funcionários com nome, data de nascimento, salário e função.

Aumento de Salário: Funcionalidade para aplicar um aumento percentual a todos os funcionários.

Relatórios e Consultas:

Impressão formatada de todos os dados dos funcionários.

Agrupamento de funcionários por cargo.

Consulta de aniversariantes por mês.

Identificação do funcionário mais velho (nome e idade).

Exibição da lista de funcionários em ordem alfabética.

Cálculo do valor total da folha salarial.

Análise salarial baseada no salário mínimo.

🛠️ Tecnologias Utilizadas
Java 8+: O projeto utiliza recursos modernos do Java, como:

java.time (LocalDate): Para manipulação precisa de datas.

java.math.BigDecimal: Para garantir a precisão em cálculos financeiros (salários).

Streams API: Para processamento declarativo e funcional de coleções (filtros, mapas, ordenação, etc.).

Expressões Lambda: Para simplificar a implementação de interfaces funcionais.

📂 Estrutura do Projeto
O código está organizado no pacote main e dividido nas seguintes classes:

Pessoa.java: Classe base que contém os atributos comuns nome e dataNascimento.

Funcionario.java: Classe que herda de Pessoa e adiciona os atributos específicos salario e funcao.

Principal.java: Classe principal (main) que contém a lógica de negócio e executa todas as operações sobre a lista de funcionários.

🚀 Como Executar
Este é um projeto Java simples e não requer dependências externas. Para compilá-lo e executá-lo via linha de comando, siga os passos abaixo:

Pré-requisitos:

Ter o JDK (Java Development Kit) 8 ou superior instalado e configurado no seu sistema.

Clone o repositório (opcional):

Bash

git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
Navegue até a pasta raiz do projeto.

Compile os arquivos .java:

Bash

# A partir da pasta que contém a pasta 'main'
javac main/*.java
Execute a classe principal:

Bash

# A partir da pasta que contém a pasta 'main'
java main.Principal
O console exibirá o resultado de todas as operações realizadas sobre a lista de funcionários.

✒️ Autor
Matheus Lino - Desenvolvedor do código original
