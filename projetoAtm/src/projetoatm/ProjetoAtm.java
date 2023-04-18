
package projetoatm;

import java.util.Scanner;


public class ProjetoAtm {

    
    public static void main(String[] args) {
        
        Pessoa myPessoa = new Pessoa("Rubens Henrique","N L", "0001", 27);
        //Conta myConta = new Conta(1,myPessoa.getConta(),10000.00);
        //System.out.println(myConta.toString());
        Poupanca myPoupanca = new Poupanca(1,"P001", 2000.00);
        Corrente myCorrente = new Corrente(1,"C001", 7000.00);
        int opc;
        int opc2;
        boolean myLoop = true;
        do{
            System.out.println("Bem Vindo - ATM 24 Horas");
            System.out.println("1 - Saque Conta Poupanca");
            System.out.println("2 - Saque Conta Corrente");
            System.out.println("3 - Ver Saldo");
            System.out.println("0 - Sair");
            
            Scanner myScanner = new Scanner(System.in);
            System.out.println();
            System.out.print("Selecao: ");
            try{
                opc = myScanner.nextInt();
                 switch(opc){
                case 0:
                    System.out.println("Saindo...");
                    myScanner.close();
                    myLoop=false;
                    break;
                case 1:
                    System.out.println("Conta Poupanca");
                    myPoupanca.VerSaldo();
                    System.out.println();
                    System.out.print("Saque valor[Poupanca]:");
                    try{
                        opc2 = myScanner.nextInt();
                        myPoupanca.Sacar(opc2);
                        System.out.println("Executando transacao...");
                    }catch(Exception e){
                        System.out.println("Use um valor valido !");
                    }
                    break;
                case 2:
                    System.out.println("Conta Corrente");
                    myCorrente.VerSaldo();
                    System.out.println("");
                    System.out.print("Saque valor[Corrente]: ");
                    try{
                        opc2 = myScanner.nextInt();
                        myCorrente.Sacar(opc2);
                        System.out.println("Executando transacao...");
                    }catch(Exception e){
                        System.out.println("Use um valor valido !");
                    }
                    break;
                case 3:
                    System.out.println("Conta Corrente: ");
                    myCorrente.VerSaldo();
                    System.out.println();
                    System.out.println("Conta Poupanca: ");
                    myPoupanca.VerSaldo();
                    System.out.println();
                    break;
            }
                
                
            }catch(Exception e){
                System.out.println("Use um valor valido !");
            }
        }while(myLoop==true);
        
        
    }
    
}
