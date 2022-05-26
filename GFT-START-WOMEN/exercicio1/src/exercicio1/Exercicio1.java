package exercicio1;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author JOSIANEMAGALHAES
 */


public class Exercicio1 {
    public static void main(String[] args) {

String nome;
String sexo;
int idade;
String corOlhos;
String corCabelos;
int dataNascimento;
String tipoSanguineo;

	System.out.println("Entre com a idade : ");
	idade = entrada.nextInt();
                if(idade>50 && peso<60){
                contIdadePeso++;
                }
            
            entrada = new Scanner(System.in);
	System.out.println("Informe a cor dos olhos A(azul) P(preto) C(castanho) e V(verde) : ");
	corOlhos =  entrada.nextLine();
                if (corOlhos.equals("a") || corOlhos.equals("A")) {
                    qtdOlhoAzul++;
                    
                }
   
            System.out.println("Informe a cor do cabelo L(louro) P(preto) C(castanho) e R(ruivo) : ");
            corCabelos = entrada.nextLine();
                if ( corCabelos.equals("R") || corCabelos.equals("r") && !"a".equals(corOlhos)) {
                    contCorCabeloR++;
            
                
            System.out.println("A porcentagem de pessoas com olhos azuis "+qtdOlhoAzul/qtdPessoas);
            System.out.println("A quantidade de pessoas ruivas que não possuem olhos azuis "+contCorCabeloR);
            
        }
    }              
}


