package exercicio4;

import java.util.Scanner;

/**
 *
 * @author JOSIANEMAGALHAES
 */

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero;
        int maior = 0;
        
        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            
            if (numero > maior) maior = numero;
            
            count = count + 1;
        } while(count < 3);
        
        System.out.println(maior + " eh o maior");
        
    }
                
}
