package aula08;

import java.util.Scanner;

/**
 * @author Diarley Silva Santos
 */
public class Aula08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        /*
        Todo programa tem:
        1 - Entrada de dados
        2 - Processamento dos dados
        3 - Saída dos dados
        */
        
        // Entrada de dados
        System.out.println("Digite a idade do seu cachorro: ");
        int idadeCachorro = teclado.nextByte();

        // Processamento dos dados
        idadeCachorro = idadeCachorro * 7;

        // Saída dos dados
        System.out.println("Seu cachorro tem " + idadeCachorro + " anos.");
    }
}