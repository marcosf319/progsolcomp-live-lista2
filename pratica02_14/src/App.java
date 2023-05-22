/*Nome: Marcos Felipe da Silva Oliveira
 * RA:722312100
 * 14. Faça um programa que preencha com zeros todas as posições de um vetor de tamanho 50
 * Data 18/05/2023
 */

public class App {
    public static void main(String[] args) throws Exception {
        int tamanho = 50;
        int[] vetor = new int[tamanho];

        for (int x = 0; x < tamanho; x++) {
            vetor[x] = 0;
        }
        for (int x = 0; x < tamanho; x++) {
            System.out.print(vetor[x] + " ");
        }

    }
}
