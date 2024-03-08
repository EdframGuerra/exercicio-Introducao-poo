package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        Funcionario colaborador = new Funcionario();

        System.out.print("Nome: ");
        colaborador.nome = leitor.nextLine();

        System.out.print("Salário: ");
        colaborador.salario = leitor.nextDouble();

        System.out.print("Imposto: ");
        colaborador.imposto = leitor.nextDouble();

        System.out.println();

        System.out.println(colaborador);

        System.out.print("Percentual de aumento salarial: ");
        int percent = leitor.nextInt();
        colaborador.aumentoSalario(percent);
        System.out.println(colaborador);

        System.out.println();

        leitor.close();
    }
}