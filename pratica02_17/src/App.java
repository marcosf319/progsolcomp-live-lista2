/*Nome: Marcos Felipe da Silva Oliveira
 * RA: 722312100
 * 17. Faça um programa que imprima os múltiplos negativos de 7, superiores a -1000. (utilize do / while)
 * Data: 18/05/2023
  */

public class App {
    public static void main(String[] args) throws Exception {
        int numero = -7;

        do {
            System.out.println(numero);
            numero -= 7;
        } while (numero >= -1000);
    }
}
