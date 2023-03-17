package desafiolojinhadoces;

import java.util.Scanner;

public class DesafioLojinhaDoces {

 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        System.out.println("O cliente obteve "+dinheiro*2+" doces");
    }
}