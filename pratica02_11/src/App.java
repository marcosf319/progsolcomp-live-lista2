/*Nome:Marcos Felipe da Silva Oliveira
 * RA:722312100
 * 11. Faça um programa que imprima todos os números pares de 1 a 100 na ordem inversa
 * Data: 18/05/2023
 */

public class App {
    public static void main(String[] args) throws Exception {
        for (int x = 100; x >= 1; x--) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }

    }
}
