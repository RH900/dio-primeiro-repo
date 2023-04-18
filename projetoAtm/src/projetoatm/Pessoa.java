
package projetoatm;


public class Pessoa {
    private String PrimeiroNome;
    private String Sobrenome;
    private String Conta;
    private int Idade;

    public Pessoa(String PrimeiroNome, String Sobrenome, String Conta, int Idade) {
        this.PrimeiroNome = PrimeiroNome;
        this.Sobrenome = Sobrenome;
        this.Conta = Conta;
        this.Idade = Idade;
    }

    public String getPrimeiroNome() {
        return PrimeiroNome;
    }

    public void setPrimeiroNome(String PrimeiroNome) {
        this.PrimeiroNome = PrimeiroNome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getConta() {
        return Conta;
    }

    public void setConta(String Conta) {
        this.Conta = Conta;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    
}
