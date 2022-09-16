
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
      public static void main(String[]args){

          Scanner sc = new Scanner(System.in); //inicia o Scanner(IO), que pega os dados digitados pelo cliente;
          ArrayList<Conta> armazena = new ArrayList<>();//Cria o Arralist do tipo conta, iniciando o objeto Vetor
          Conta conta;

          String titular;// atributo titular
          int numero_conta;
          int qtdContas;// atributo numero da contador
          double saldo;

           System.out.println("Entre com o numero de contas que deseja inserir:");
            qtdContas = sc.nextInt();

                  for (int i=0; i <= qtdContas; i++){

                      conta = new Conta();

                      System.out.println(" Qual é o nome do titular:");
                      titular = sc.next();
                      conta.setTitular(titular);

                      System.out.println("Digite o numero da conta:");
                      numero_conta = sc.nextInt();
                      conta.setNumero(numero_conta);
                      conta.validaConta(numero_conta, armazena.toArray(new Conta[i]));


                      System.out.println("Digite o seu saldo:");
                      saldo = sc.nextInt();
                      conta.setSaldo(saldo);

                      armazena.add(conta);
                      //conta.validaConta(numero_conta, armazena.toArray(new Conta[i]));
                      //aqui a função pega o item recem adicionado e compara.

                      System.out.println("\n\n");
                      System.out.println("Contas criadas ,\n ___Titular:" + armazena.get(i).getTitular() + "\n__Numero:"+ armazena.get(i).getNumero() +
                              "\n__Saldo:"+ armazena.get(i).getSaldo());
                      System.out.println("\n\n");


                  }

                  for (int i=0; i <= qtdContas; i++){

                          System.out.println("Contas criadas , ___Titular:" + armazena.get(i).getTitular() + "__Numero:"+ armazena.get(i).getNumero() +
                                   "__Saldo:"+ armazena.get(i).getSaldo()+"\n");

                  }sc.close();
     }
}
