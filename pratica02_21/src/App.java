/*Nome:Marcos Felipe da Silva Oliveira
 *RA:722312100
 *21. Escreva um programa que, dado um número positivo digitado pelo o usuário mostre a tabuada de todos os números de 1 até o número digitado. (utilize for */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = teclado.nextInt();

        if (numero <= 0) {
            System.out.println("O número digitado não é válido.");
        } else {
            for (int x = 1; x <= numero; x++) {
                System.out.println("Tabuada do " + x + ":");
                for (int y = 1; y <= 10; y++) {
                    System.out.println(x + " x " + y + " = " + (x * y));
                }

            }
        }
        teclado.close();
    }
}
