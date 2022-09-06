
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
      public static void main(String[]args){

          Scanner sc = new Scanner(System.in); //inicia o Scanner(IO), que pega os dados digitados pelo cliente;
          Conta conta;// = new Conta();//Cria um atributo;
          ArrayList<Conta> armazena = new ArrayList<>();//Cria o Arralist do tipo conta, iniciando o objeto Vetor

          String titular;// atributo titular
          int numero_conta, qtdContas;// atributo numero da con
          double saldo = 0;

           System.out.println("Entre com o numero de contas que deseja inserir:");
            qtdContas = sc.nextInt();

                  for (int i=0; i <= qtdContas; i++){

                      conta = new Conta();
                    //for(int i=0; i<2; i++){
                      System.out.println(" Qual é o nome do titular:");
                      titular = sc.next();
                      conta.setTitular(titular);


                      System.out.println("Digite o numero da conta:");
                      numero_conta = sc.nextInt();
                      //conta.validaConta(numero_conta);
                      conta.setNumero(numero_conta);


                      System.out.println("Digite o seu saldo:");
                      saldo = sc.nextInt();
                      conta.setSaldo(saldo);

                      armazena.add(conta);

                      System.out.println("\n\n");
                      System.out.println("Contas criadas ,\n ___Titular:" + armazena.get(i).getTitular() + "\n__Numero:"+ armazena.get(i).getNumero() +
                              "\n__Saldo:"+ armazena.get(i).getSaldo());
                      System.out.println("\n\n");

                  }

                  for (int i=0; i <= qtdContas; i++){
                   //for(int i=0; i<2; i++){
                      if(armazena!= null) {

                          System.out.println("Contas criadas ,\n ___Titular:" + armazena.get(i).getTitular() + "\n__Numero:"+ armazena.get(i).getNumero() +
                                   "\n__Saldo:"+ armazena.get(i).getSaldo()+"\n");
                      }
                  }
     }

}
