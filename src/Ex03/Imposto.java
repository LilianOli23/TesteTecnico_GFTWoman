package Ex03;

import java.util.Scanner;

public class Imposto {

    public static void main(String[] args) {

        double ICMS;
        double IPI;
        double COFINS;


        System.out.println("Digite um valor: ");

        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();

        ICMS = valor * 0.3;

        if (valor <= 25000) {
            IPI = valor * 0.5;
        } else {
            IPI = valor * 0.1;
        }

        if (valor <= 17000) {
            COFINS = 0;
        } else {
            COFINS = valor * 0.08;
        }
        double impostoFinal = ICMS + IPI + COFINS;



        System.out.println("O ICMS custará " + ICMS);
        System.out.println("O IPI custará " + IPI);
        System.out.println("O COFINS custará " + COFINS);
        System.out.println("O imposto final custará " + impostoFinal );


    }

}
