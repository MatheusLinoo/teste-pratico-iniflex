# 🧑‍💼 Teste Prático – Gestão de Funcionários (Iniflex)
Este projeto é uma solução em **Java** para um desafio de programação que envolve a criação e manipulação de uma lista de funcionários.  
O sistema realiza operações como inserção, remoção, cálculo de salários, agrupamento por função e exibição de dados formatados.

## 📜 Descrição
O objetivo principal é demonstrar o uso de conceitos fundamentais e avançados da linguagem Java, incluindo:
- **POO** (Programação Orientada a Objetos)  
- **Coleções** (`List`, `Map`, etc.)  
- **Streams API** para processamento declarativo de dados  
- **java.time** para tratamento de datas  
- **BigDecimal** para cálculos financeiros com precisão  

## 🔄 Fluxo da Aplicação
A classe `Principal` executa as seguintes tarefas em sequência:
1. **Criação e Inserção**: Instancia e insere um conjunto de funcionários em uma lista.  
2. **Remoção**: Remove o funcionário `"João"`.  
3. **Aumento Salarial**: Aplica aumento de **10%** para todos os funcionários.  
4. **Agrupamento**: Agrupa funcionários por função em um `Map`.  
5. **Filtragem**: Exibe funcionários que fazem aniversário em **outubro** e **dezembro**.  
6. **Cálculos e Ordenação**:  
   - Encontra o funcionário **mais velho**.  
   - Ordena funcionários em ordem **alfabética**.  
   - Calcula a **soma total dos salários**.  
   - Mostra **quantos salários mínimos** cada funcionário recebe.  

## ✨ Funcionalidades
- ✅ **Cadastro de Funcionários**: nome, data de nascimento, salário e função.  
- ✅ **Aumento Salarial**: aplicação de percentual sobre o salário.  
- ✅ **Relatórios e Consultas**:  
  - Impressão formatada dos dados.  
  - Agrupamento por cargo.  
  - Consulta de aniversariantes.  
  - Identificação do mais velho.  
  - Ordenação alfabética.  
  - Cálculo da folha salarial.  
  - Análise salarial em múltiplos do salário mínimo.  

## 🛠️ Tecnologias Utilizadas
- ☕ **Java 8+**  
- 📅 `java.time.LocalDate`  
- 💰 `java.math.BigDecimal`  
- 🔗 **Streams API**  
- ⚡ **Expressões Lambda**  

## 📂 Estrutura do Projeto
main/
├── Pessoa.java # Classe base com nome e dataNascimento
├── Funcionario.java # Herda de Pessoa, adiciona salario e funcao
└── Principal.java # Contém a lógica de negócio e execução


## 🚀 Como Executar
### Pré-requisitos
- **JDK 8+** instalado e configurado.  

### Passos
1. Clone o repositório *(opcional)*:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio

2. Compile os arquivos:
   
   bash
   
   # A partir da pasta que contém 'main'
   javac main/*.java

4. Execute o programa:

   bash
   
   java main.Principal

O console exibirá todos os relatórios e operações realizadas.

✒️ Autor

👨‍💻 Matheus Lino – Desenvolvedor do código original
