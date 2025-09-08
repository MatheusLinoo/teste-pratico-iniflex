package main;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        // Formata a data para o padrão brasileiro
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Define o Locale para o Brasil para garantir a formatação correta dos números
        Locale brasil = new Locale("pt", "BR");
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(brasil);
        DecimalFormat formatadorDecimal = new DecimalFormat("#,##0.00", simbolos);

        return "Nome: " + getNome() +
               ", Data de Nascimento: " + getDataNascimento().format(formatadorData) +
               ", Salário: R$ " + formatadorDecimal.format(salario) +
               ", Função: " + funcao;
    }
}
