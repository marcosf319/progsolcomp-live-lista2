/*Nome: Marcos Felipe da Silva Oliveira 
 * RA:722312100
 * 9. Faça um programa que receba o valor da venda, escolha a condição de pagamento no menu e mostre o total da venda final 
conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7%
 * Data 18/05/2023
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor da venda: ");
        double valordavenda = teclado.nextDouble();
        System.out.printf(
                "Informe a forma de pagamento \nA vista digete 1: \nPrazo 30 dias digite 2:\nPrazo 60 dias digete 3:\nPrazo 90 dias digite 4:\nCartão de débito digite 5:\nCartão de crédito digite 6:\n");
        int fordepag = teclado.nextInt();
        teclado.close();

        double avista = valordavenda - (valordavenda * 0.1);
        double prazo30 = valordavenda - (valordavenda * 0.05);
        double prazo60 = valordavenda;
        double prazo90 = valordavenda + (valordavenda * 0.05);
        double debito = valordavenda - (valordavenda * 0.08);
        double credito = valordavenda - (valordavenda * 0.07);

        switch (fordepag) {
            case 1:
                System.out.println(avista + " R$");
                break;
            case 2:
                System.out.println(prazo30 + " R$");
                break;
            case 3:
                System.out.println(prazo60 + " R$");
                break;
            case 4:
                System.out.println(prazo90 + " R$");
                break;
            case 5:
                System.out.println(debito + " R$");
                break;
            case 6:
                System.out.println(credito + " R$");
                break;
            default:
                System.out.println("Digite um número de 1 a 6(tente novamente)");

        }

    }
}
