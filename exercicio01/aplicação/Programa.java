package exercicio01.aplicação;

import java.util.Locale;
import java.util.Scanner;

import exercicio01.entidade.Retangulo;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
       

        System.out.println("Informe as medias altura e largura: ");
        retangulo.altura = leitor.nextDouble();
        retangulo.largura = leitor.nextDouble();
        System.out.printf("AREA = %.2f%n ",retangulo.area() );
        System.out.printf("PERIMETRO = %.2f%n ", retangulo.perimetro() );
        System.out.printf("DIAGONAL = %.2f%n ", retangulo.diagonal() );

        leitor.close();
    }
}
