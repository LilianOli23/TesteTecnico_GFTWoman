package Ex04;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {

    public static void main(String[] args) {

        System.out.println("Digite um número entre 0 e 10: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        Random random = new Random();

        int numeroInteiroAleatorio = random.nextInt(10);
        System.out.println("Número inteiro aleatório de 0 até 10: " + numeroInteiroAleatorio);

        if (num == numeroInteiroAleatorio) {

            System.out.println("Parabéns, você acertou!");
        } else {

            System.out.println("Tente outra vez!");

        }

    }

}
