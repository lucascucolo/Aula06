package exercicio06;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner digitaNumero = new Scanner(System.in);
        Scanner digitaTexto = new Scanner(System.in);
        GerenciarContas contas = new GerenciarContas();
        int numGeraConta;
        char opcaoGeral='q',opcaoInterna='q';

        do {
            System.out.println("a - Adicionar uma nova conta");
            System.out.println("b - Listar todas as contas");
            System.out.println("c - Consultar saldo conta especifica");
            System.out.println("d - Realizar deposito");
            System.out.println("e - Realizar saque");
            System.out.println("z - Sair");
            opcaoGeral=digitaTexto.nextLine().charAt(0);
            switch (opcaoGeral) {
                case 'a':
                    System.out.println("a - Conta Corrente");
                    System.out.println("b - Conta Especial");
                    System.out.println("c - Conta Poupança");
                    opcaoInterna=digitaTexto.nextLine().charAt(0);
                    numGeraConta=contas.gerarNumConta();
                        if(opcaoInterna=='a'){
                            contas.addContaCorrente(numGeraConta);
                        }else{
                            if(opcaoInterna=='b'){
                                contas.addContaEspecial(numGeraConta);
                            }else{
                                if(opcaoInterna=='c'){
                                contas.addContaPoupanca(numGeraConta);
                                }
                                System.out.println("opcao invalida");
                            }
                        }
                    break;
                case 'b':
                    System.out.println(contas.listarTodasContas());
                    System.out.print("aperte enter para voltar ao menu");
                    System.out.println(digitaTexto.nextLine());
                    break; 
                case 'c':
                    System.out.print("numero da conta: ");
                    System.out.println(contas.listarSaldo(digitaNumero.nextInt()));
                    System.out.print("aperte enter para voltar ao menu");
                    System.out.println(digitaTexto.nextLine());
                    break; 
                case 'd':
                    System.out.print("Valor a ser depositado: ");
                    int deposito=digitaNumero.nextInt();
                    System.out.print("Numero da conta:");
                    contas.Depositar(deposito,digitaNumero.nextInt());
                    System.out.print("aperte enter para voltar ao menu");
                    System.out.println(digitaTexto.nextLine());

                    break;
                case 'e':
                    System.out.print("Valor a ser sacado: ");
                    int saque=digitaNumero.nextInt();
                    System.out.print("Numero da conta:");
                    contas.Sacar(saque,digitaNumero.nextInt());
                    System.out.print("aperte enter para voltar ao menu");
                    System.out.println(digitaTexto.nextLine());

                    break;

                default:
                    break;
            }

        } while (opcaoGeral != 'z');

        digitaNumero.close();
        digitaTexto.close();
    }
}