/*Nome:Marcos Felipe da Silva Oliveira
 * RA:722312100
 * 19. Um determinado gás duplica seu volume a cada segundo. Dada um volume inicial, em centímetros cúbicos, digitado pelo 
usuário faça um programa que determine o tempo necessário para que esse volume se torne maior que 1000 centímetros cúbicos. (utilize while)
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o volume inicial em centímetros cúbicos: ");
        int volInicial = teclado.nextInt();

        int tempo = 0;
        int volume = volInicial;

        while (volume <= 1000) {
            volume *= 2;
            tempo++;
        }

        System.out
                .println("O tempo necessário para que o volume se torne maior que 1000 cm³ é: " + tempo + " segundos.");
        teclado.close();
    }
}
