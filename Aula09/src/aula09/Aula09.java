package aula09;

import java.util.Scanner;

/**
 * @author Diarley Silva Santos
 */
public class Aula09 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float numero1, numero2, soma, subtracao, multi, divisao;
        
        System.out.print("Digite um número: ");
        numero1 = teclado.nextFloat();
        
        System.out.print("Digite outro número: ");
        numero2 = teclado.nextFloat();
        
        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multi = numero1 * numero2;
        divisao = numero1 / numero2;
         
        System.out.println("A soma entre " + numero1 + " + " + numero2 + " é: " + soma);
        System.out.println("A subtração entre " + numero1 + " - " + numero2 + " é: " + subtracao);
        System.out.println("A multiplicação entre " + numero1 + " x " + numero2 + " é: " + multi);
        System.out.println("A subtração entre " + numero1 + " / " + numero2 + " é: " + divisao);
    }
}