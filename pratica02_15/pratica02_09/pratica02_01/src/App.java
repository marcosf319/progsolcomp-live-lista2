/*Nome: Marcos Felipe da Si Oliveira
 * RA: 722312100
 * 1. Faça um programa que leia dois números A e B e imprima o maior deles.
 * Data: 15/05/2023 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.print("informe o primeiro numero: ");
        float A = teclado.nextFloat();
        System.out.print("Informe o segundo numero: ");
        float B = teclado.nextFloat();
        teclado.close();

        if (A > B) {
            System.out.println(A);
        } else if (B > A) {
            System.out.println(B);
        } else {
            System.out.println("Os numeros são iguais, tente novamente");
        }

    }
}
