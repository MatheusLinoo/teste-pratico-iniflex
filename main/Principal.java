package main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        // Tópico 3.1
        System.out.println("Inserindo funcionários");

        funcionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        funcionarios.add(new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
        funcionarios.add(new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coodenador"));
        funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        funcionarios.add(new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"));
        funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        funcionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"));
        funcionarios.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        funcionarios.add(new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        funcionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));

        System.out.println("--------------------------------------------------\n");

        // Tópico 3.2
        System.out.println("Removendo João");
        funcionarios.removeIf(f -> f.getNome().equals("João"));
        System.out.println("--------------------------------------------------\n");

        // Tópico 3.3
        System.out.println("Imprimindo todos os funcionários:");
        funcionarios.forEach(System.out::println);
        System.out.println("--------------------------------------------------\n");


        // Tópico 3.4
        System.out.println("Aplicando aumento de 10% no salário");
        BigDecimal percentualAumento = new BigDecimal("1.10");
        funcionarios.forEach(f -> f.setSalario(f.getSalario().multiply(percentualAumento)));
        System.out.println("Salários atualizados. Nova lista:");
        funcionarios.forEach(System.out::println);
        System.out.println("--------------------------------------------------\n");


        // Tópicos 3.5 e 3.6
        System.out.println("Agrupando e imprimindo funcionários por função:");
        Map<String, List<Funcionario>> funcionariosPorFuncao = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));
        
        funcionariosPorFuncao.forEach((funcao, lista) -> {
            System.out.println("\nFunção: " + funcao);
            lista.forEach(System.out::println);
        });
        System.out.println("--------------------------------------------------\n");


        // Tópico 3.8
        System.out.println("Imprimindo aniversariantes dos meses 10 e 12:");
        funcionarios.stream()
            .filter(f -> f.getDataNascimento().getMonthValue() == 10 || f.getDataNascimento().getMonthValue() == 12)
            .forEach(System.out::println);
        System.out.println("--------------------------------------------------\n");


        // Tópico 3.9
        System.out.println("Imprimindo funcionário com maior idade:");
        Funcionario maisVelho = funcionarios.stream()
                                  .min(Comparator.comparing(Funcionario::getDataNascimento))
                                  .orElse(null);
        if (maisVelho != null) {
            int idade = Period.between(maisVelho.getDataNascimento(), LocalDate.now()).getYears();
            System.out.println("Nome: " + maisVelho.getNome() + ", Idade: " + idade + " anos.");
        }
        System.out.println("--------------------------------------------------\n");


        // Tópico 3.10
        System.out.println("Imprimindo lista em ordem alfabética:");
        funcionarios.stream()
            .sorted(Comparator.comparing(Pessoa::getNome))
            .forEach(System.out::println);
        System.out.println("--------------------------------------------------\n");


        // Tópico 3.11
        System.out.println("Imprimindo o total dos salários:");
        BigDecimal totalSalarios = funcionarios.stream()
                                     .map(Funcionario::getSalario)
                                     .reduce(BigDecimal.ZERO, BigDecimal::add);

        Locale brasil = new Locale("pt", "BR");
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(brasil);
        DecimalFormat formatadorDecimal = new DecimalFormat("#,##0.00", simbolos);
        System.out.println("Total dos salários: R$ " + formatadorDecimal.format(totalSalarios));
        System.out.println("--------------------------------------------------\n");


        // Tópico 3.12
        System.out.println("Calculando quantos salários mínimos cada um ganha:");
        BigDecimal salarioMinimo = new BigDecimal("1212.00");
        System.out.println("(Salário Mínimo de referência: R$ 1.212,00)");
        
        funcionarios.forEach(f -> {
            BigDecimal qtdSalariosMinimos = f.getSalario().divide(salarioMinimo, 2, RoundingMode.HALF_UP);
            System.out.println(f.getNome() + " ganha " + qtdSalariosMinimos + " salários mínimos.");
        });
        System.out.println("--------------------------------------------------\n");

    }
}
