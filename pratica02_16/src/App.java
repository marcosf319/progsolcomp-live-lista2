/*Nome:Marcos Felipe da Silva Oliveira 
 *RA:722312100
 *16. Faça um programa que solicite ao usuário que digite um número até que ele digite um número menor que 0 (utilize while)
 *Data: 18/05/2023*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();
        } while (numero >= 0);
        teclado.close();
        System.out.println("Você digitou um número menor que 0. O programa será encerrado.");

    }
}
