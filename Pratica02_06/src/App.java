/* Nome:Marcos Felipe da Silva Oliveira 
 * RA: 722312100
 * 6. Faça um programa para imprimir o conceito de um aluno. O conceito é calculado em função da nota do aluno que varia de
 0 a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente, 50 a 64 Regular, 65 a 84 Bom,85 100 Ótimo
 * Data 18/05/2023*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a nota do aluno: ");
        float nota = teclado.nextFloat();

        if (nota < 50) {
            System.out.println("Nota insuficiete");
        } else if (nota >= 50 && nota < 65) {
            System.out.println("Nota regular");
        } else if (nota >= 65 && nota <= 84) {
            System.out.println("Nota Boa");
        } else if (nota >= 85 && nota <= 100) {
            System.out.println("Nota ótima");
        } else {
            System.out.println("Indorme um numero menor ou igual a 100(Tente novamente)");
        }
        teclado.close();
    }
}
