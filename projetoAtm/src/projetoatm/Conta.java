
package projetoatm;


public class Conta {
    private int Agencia;
    private String ContaId;
    private Double Saldo;

    public Conta(int Agencia, String ContaId, Double Saldo) {
        this.Agencia = Agencia;
        this.ContaId = ContaId;
        this.Saldo = Saldo;
    }

    public int getAgencia() {
        return Agencia;
    }

    public void setAgencia(int Agencia) {
        this.Agencia = Agencia;
    }

    public String getContaId() {
        return ContaId;
    }

    public void setContaId(String ContaId) {
        this.ContaId = ContaId;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }
    
    public void Sacar( int valor){
        
    }
    
    public void VerSaldo(){
        System.out.print("Saldo: R$"+getSaldo());
    }
    
    
}
