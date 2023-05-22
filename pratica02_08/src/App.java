/*Nome:Marcos Felipe da Silva Oliveira
 * RA:722312100
 * 8. Crie um programa que lê um número entre 1 e 12, correspondendo a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro. 
 Ao final, o programa deve imprimir uma mensagem identificando, com base no número digitado, o nome do mês e a estação.
 *Data 18/05/2023*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digete o numero correspondende ao mês: ");
        int mes = teclado.nextInt();

        teclado.close();

        switch (mes) {
            case 1:
                System.out.println("Janeiro, verão ");
                break;
            case 2:
                System.out.println("Fevereiro, verão");
                break;
            case 3:
                System.out.println("Março, outono");
                break;
            case 4:
                System.out.println("Abril, outono");
                break;
            case 5:
                System.out.println("Março, outono");
                break;
            case 6:
                System.out.println("Junho, inverno");
                break;
            case 7:
                System.out.println("Julho, inverno");
                break;
            case 8:
                System.out.println("Agosto, inverno");
                break;
            case 9:
                System.out.println("Setembro, primavera");
                break;
            case 10:
                System.out.println("Outubro, primavera");
                break;
            case 11:
                System.out.println("Novembro, primavera");
                break;
            case 12:
                System.out.println("Dezembro, verão");
            default:
                System.out.println("Digete um numero de 1 a 12!");
                return;
        }
    }
}
