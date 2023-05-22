/*Nome:Marcos Felipe da Silva Oliveira
 * RA:722312100
 * 4. Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar e se é positivo ou negativo.
 * Data: 18/05/2023 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        double X = teclado.nextDouble();
        teclado.close();
        if (X % 2 == 0) {
            System.out.println(X + " é par.");
        } else {
            System.out.println(X + " é impar.");
        }
    }
}
