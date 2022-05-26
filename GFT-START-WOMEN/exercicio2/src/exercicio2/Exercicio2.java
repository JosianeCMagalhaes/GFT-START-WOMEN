package exercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JOSIANEMAGALHAES
 */


public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Em que turno você trabalha?");
        System.out.println("Digite M caso seja o turno matutino; V para vespertino; ou N para noturno.");
        char turno = sc.nextLine().toUpperCase().charAt(0);

        switch (turno) {
            case 'M':
                System.out.println("Bom Dia!");
                break;
            case 'V':
                System.out.println("Boa Tarde!");
                break;
            case 'N':
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor inválido!");
                break;
        }

        sc.close();

    }
}
