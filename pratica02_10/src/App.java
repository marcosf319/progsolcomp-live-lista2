/*Nome:Marcos Felipe da Silva Oliveira
 * RA:722312100
 * Faça um programa que imprima todos os números pares de 1 a 10
 * Data 18/05/2023
 */

public class App {
    public static void main(String[] args) throws Exception {
        for (int x = 1; x <= 100; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
}