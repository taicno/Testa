import javax.management.remote.SubjectDelegationPermission;

public class Conta {
    int numero;
    String titular;
    double saldo;

    public Conta() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(String titular, int numero, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

   /* public void validaConta(int numero) {// reconhece se digitar 0, porem não passa pelo vetor para ver se existe o valor no vetor
        this.numero = numero;
        if ((numero == 0) || (numero != getNumero())) {
            System.out.println("Conta não pode ser criada");
        }
    }*/
}