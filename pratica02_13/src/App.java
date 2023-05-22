/*Nome:Marcos Felipe da Silva Oliveira
 * RA:722312100
 * 13. Faça um programa que some os números de 1 a 100 e imprima somente o valor total da soma (utilize while).
 * Data 18/05/2023
 */

public class App {
    public static void main(String[] args) throws Exception {
        int num = 1;
        int soma = 0;

        while (num <= 100) {
            soma += num;
            num++;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);

    }
}
