
package projetoatm;


public class Poupanca extends Conta{
    
    public Poupanca(int Agencia, String ContaId, Double Saldo) {
        super(Agencia, ContaId, Saldo);
    }
    public void Sacar(int valor){
        this.setSaldo(this.getSaldo()-valor);
        System.out.println("Conta Poupança - Novo saldo: R$"+this.getSaldo());
    }
}
