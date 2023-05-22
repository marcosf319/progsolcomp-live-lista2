/*NOme; Marcos Felipe da Silva Oliveira 
 * RA:722312100
 * Elabore um programa que lê dois valores A e B e os escreve com a mensagem: “São múltiplos” ou “Não são múltiplos”.
 * Data: 18/05/2023 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Infoeme o primeiro numero: ");
        double A = teclado.nextDouble();
        System.out.print("Informe o segundo numero: ");
        double B = teclado.nextDouble();
        teclado.close();
        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos!");
        } else {
            System.out.println("Não são múltiplos!");
        }

    }
}
