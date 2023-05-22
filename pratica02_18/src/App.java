
/*Nome: Marcos Felipe da Silva Oliveira 
 * RA:722312100
 * 18. Faça um programa que determine o fatorial de um número. Para este problema, tem-se como entrada o valor do número do 
qual se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O fatorial de um número N (N!) é definido conforme a seguir 
(utilize for):
N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
  */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        int fatorial = 1;
        for (int x = 1; x <= numero; x++) {
            fatorial *= x;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        teclado.close();
    }
}
