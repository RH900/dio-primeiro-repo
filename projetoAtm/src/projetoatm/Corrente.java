
package projetoatm;


public class Corrente extends Conta {
    
    public Corrente(int Agencia, String ContaId, Double Saldo) {
        super(Agencia, ContaId, Saldo);
    }

    @Override
    public void Sacar(int valor){
        this.setSaldo(this.getSaldo()-valor);
        System.out.println("Conta Corrente - Novo saldo: R$"+this.getSaldo());
    }
}
