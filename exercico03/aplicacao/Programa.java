package exercico03.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import exercico03.entidades.Estudante;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        Estudante aluno = new Estudante();

        System.out.print("Informe o nome do Aluno: ");
        aluno.nome = leitor.nextLine();
        System.out.println("Informe as notas: ");
        aluno.nota1 = leitor.nextDouble();
        aluno.nota2 = leitor.nextDouble();
        aluno.nota3 = leitor.nextDouble();
        System.out.printf("NOTA FINAL: %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal() < 60.0) {
            System.out.println("REPROVADO");
            System.out.printf("FALTA(M) %.2f pontos%n", aluno.faltaPontos());
        } else {
            System.out.println("APROVADO");
        }

        leitor.close();
    }
}
