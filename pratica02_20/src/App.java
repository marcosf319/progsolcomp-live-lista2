
/*Nome: Marcos Felipe da Silva Oliveira
 * RA:722312100
 * 20. Escreva um programa que, dada a carga máxima de um elevador e a quantidade máxima de pessoas digitadas pelo 
 usuário, leia o peso de cada pessoa, também digitada pelo usuário, que entra no elevador até que a carga máxima seja
 atingida ou o número máximo de pessoas seja atingido (utilize do /while).

 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a carga máxima do elevador: ");
        int cargaMaxima = teclado.nextInt();

        System.out.print("Digite a quantidade máxima de pessoas: ");
        int quantidadeMaximaPessoas = teclado.nextInt();

        int cargaAtual = 0;
        int quantidadePessoas = 0;

        do {
            System.out.print("Digite o peso das pessoas: ");
            int pesoPessoa = teclado.nextInt();

            if (quantidadePessoas < quantidadeMaximaPessoas) {
                cargaAtual += pesoPessoa;
                quantidadePessoas++;
            } else {
                System.out.println("carga máxima atingida");
                break;
            }
            if (cargaAtual >= cargaMaxima) {
                System.out.println("carga máxima atingida");
                break;
            }
        } while (true);
        teclado.close();

        System.out.println("Fim");

    }
}
