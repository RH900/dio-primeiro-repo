
package desafioleituragertrudes;

import java.util.Scanner;


public class DesafioLeituraGertrudes {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        if(paginas <= 3){
            System.out.println(1 + "dia");
        }
        else{
            int dias = paginas/paginasLidas;
            if(paginas % paginasLidas != 0){
                dias++;
            }
            System.out.println(dias + "dias");
        }
    }
    
}
