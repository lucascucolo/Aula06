package exercicio06;

import java.util.ArrayList;

public class GerenciarContas {
    private ArrayList<Conta> contas;

    public GerenciarContas(){
        contas = new ArrayList<>();
    }

    public void addContaCorrente(int numConta){
        Conta conta = new ContaCorrente(numConta);
        contas.add(conta);
    }
    public void addContaEspecial(int numConta, double limite){
        Conta conta = new ContaEspecial(numConta,limite);
        contas.add(conta);
    }
    public void addContaPoupanca(int numConta){
        Conta conta = new ContaPoupanca(numConta);
        contas.add(conta);
    }

    public boolean Depositar(double deposito,int numConta){
        for (Conta conta : contas){
            if(conta.getNumConta()==numConta){
                conta.Depositar(deposito);
                return true;
            }
        }
        return false;
    }

    public boolean Sacar(double saque,int numConta){
        for (Conta conta : contas){
            if(conta.getNumConta()==numConta){
                conta.Sacar(saque);
                return true;
            }
        }
        return false;
    }

    public String listarContas(){
        String saida = "";
        for (Conta conta : contas){
            saida += "------------ "+conta.getNumConta()+": "+ conta.getSaldoConta() + "\n";
        }
        return saida;
    }
}