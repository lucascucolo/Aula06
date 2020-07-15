package exercicio06;

import java.util.ArrayList;
import java.util.TreeSet;
import java.lang.Math;

public class GerenciarContas {
    private ArrayList<Conta> contas;
    private TreeSet<Integer> numContasGeral = new TreeSet<>();
    private int limite=100;

    public GerenciarContas() {
        contas = new ArrayList<>();
    }

    public int gerarNumConta() {
        int numAleatorio;
        boolean validacaoNum;
        do {
            numAleatorio = 100 + (int) (Math.random() * 999);
            validacaoNum = numContasGeral.add(numAleatorio);
        } while (validacaoNum != true);
        return numAleatorio;
    }

    // ################## Adicionar nova Conta ####################
    public void addContaCorrente(int numConta) {
        Conta conta = new ContaCorrente(numConta);
        contas.add(conta);
    }

    public void addContaEspecial(int numConta) {
        Conta conta = new ContaEspecial(numConta, limite);
        contas.add(conta);
    }

    public void addContaPoupanca(int numConta) {
        Conta conta = new ContaPoupanca(numConta);
        contas.add(conta);
    }

    

    // ###########################################################
    public boolean Depositar(double deposito, int numConta) {
        for (Conta conta : contas) {
            if (conta.getNumConta() == numConta) {
                conta.Depositar(deposito);
                return true;
            }
        }
        return false;
    }

    public boolean Sacar(double saque, int numConta) {
        for (Conta conta : contas) {
            if (conta.getNumConta() == numConta) {
                conta.Sacar(saque);
                return true;
            }
        }
        return false;
    }

    public String listarTodasContas() {
        String saida = "";
        for (Conta conta : contas) {
            if (conta instanceof ContaCorrente) {
            saida += "------------ Conta Corrente: " + conta.getNumConta() + "\n";
            }
            if (conta instanceof ContaEspecial) {
            saida += "------------ Conta Especial: " + conta.getNumConta() + "\n";
            }
            if (conta instanceof ContaPoupanca) {
            saida += "------------ Conta Poupança: " + conta.getNumConta() + "\n";
            }
        }
        return saida;
    }

    public String listarSaldo(int numConta) {
        String saida = "";
        for (Conta conta : contas) {
            if (conta.getNumConta() == numConta && conta instanceof ContaCorrente) {
                return saida += "------------ Conta Corrente: " + conta.getNumConta() + ": R$" + conta.getSaldoConta() + "\n";
            }
            if (conta.getNumConta() == numConta && conta instanceof ContaEspecial) {
                return saida += "------------ Conta Especial: " + conta.getNumConta() + ": R$" + conta.getSaldoConta() + "\n";
            }
            if (conta.getNumConta() == numConta && conta instanceof ContaPoupanca) {
                return saida += "------------ Conta Poupança: " + conta.getNumConta() + ": R$" + conta.getSaldoConta() + "\n";
            }
        }
        return "Conta inexistente";
    }
}