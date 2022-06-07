package Ex01;

import java.util.Scanner;

public class Main extends Produto {

    public static void main(String[] args) {

        double desconto = 0;
        String produto;
        double quantidade = 0;

        int t1 = 1;
        int t2 = 2;
        int t3 = 3;

        String p1 = "banana";
        String p2 = "energetico";
        String p3 = "arroz";
        String p4 = "chocolate";
        String p5 = "leite";
        String p6 = "abacaxi";



        if (tipo == 1) {
            desconto = (preco * quantidade) * 0.1;
        } else if (tipo == 2) {
            desconto = (preco * quantidade) * 0.2;
        } else if (tipo == 3) {
            if (quantidade > 5) {
                desconto = (preco * quantidade) * 0.1;
            } else {
                desconto = 0;
            }

        }


        System.out.println("O valor final será de: ");





    }

}
