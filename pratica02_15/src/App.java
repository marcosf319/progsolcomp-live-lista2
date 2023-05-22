/*Nome:Marcos Felipe da Silva Oliveira
 * RA:722312100
 *15. Faça um programa que preencha com zeros todas as posições de uma matriz com 10 linha e 10 colunas
 *Data:18/05/2023*/

public class App {
    public static void main(String[] args) throws Exception {
        int linhas = 10;
        int colunas = 10;
        int[][] matriz = new int[linhas][colunas];

        for (int x = 0; x < linhas; x++) {
            for (int y = 0; y < colunas; y++) {
                matriz[x][y] = 0;
            }
        }

        System.out.println("Matriz preenchida com zeros:");
        for (int x = 0; x < linhas; x++) {
            for (int y = 0; y < colunas; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }
    }
}
