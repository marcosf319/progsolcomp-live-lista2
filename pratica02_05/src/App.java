/*Nome:Marcos Felipe da Silva Oliveira
 * RA:722312100
 * 5. Faça um programa que leia o nome, o sobrenome, a idade, em anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja visualizar dados completos?”. Se o caractere digitado pelo usuário for ‘S’ o programa deve imprimir na tela Nome, 
Sobrenome, idade e naturalidade. Se o caractere digitado pelo usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se 
o caractere não for nenhuma das outras opções acima o programa deve imprimir “Digitação errada. Tente Novamente”.
*Data 18/05/2023 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Informe o sobrenome: ");
        String sobrenome = teclado.nextLine();
        System.out.print("Informe sua idade: ");
        int idade = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Informe sua naturalidade: ");
        String naturalidade = teclado.nextLine();
        System.out.print("Deseja visualizar dados completos?(se sim digite (S) se não digite (N))");
        char resposta = teclado.nextLine().charAt(0);

        if (resposta == 'S') {
            System.out.printf("Nome: %s\nsobrenome: %s\nIdade: %d\nnaturalidade %s\n ", nome, sobrenome, idade,
                    naturalidade);

        } else if (resposta == 'N') {
            System.out.printf("Nome: %s\nIdade %d\n", nome, idade);

        } else {
            System.out.print("Tente Novamente");
        }
        teclado.close();
    }
}
