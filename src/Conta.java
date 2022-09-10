

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

    public void validaConta(int numero, Conta [] conta , int tam_vetor ) {//

          for(int i=1; i <= conta.length; i++){
              System.out.println("Numero do Array" +conta[i].getNumero());
              System.out.println("Numero:" + numero);
            if ((numero == 0) || (numero == conta[i].getNumero())){
                System.out.println("Conta não pode ser criada");
            }
        }
    }
}