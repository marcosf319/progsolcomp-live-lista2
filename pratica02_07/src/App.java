/* Nome; Marcos Felipe da Silva Oliveira
 * RA: 722312100
 * 7. Faça um programa calcula o total de uma hospedagem em um hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15
 *Data: 18/05/2023  */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe quantos dias o cliente ficou hospedado");
        int diarias = teclado.nextInt();

        double valor1 = (diarias * 60) + (diarias * 5.5);
        double valor2 = (diarias * 60) + (diarias * 6);
        double valor3 = (diarias * 8) + (diarias * 8);

        if (diarias > 15) {
            System.out.println(valor1 + " R$");
        } else if (diarias == 15) {
            System.out.println(valor2 + " R$");
        } else if (diarias > 15) {
            System.out.println(valor3 + " R$");
        }
        teclado.close();

    }
}
