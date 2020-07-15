package exercicio06;

public class ContaCorrente extends Conta {
    private static double taxaCC=0.1;

    ContaCorrente(int numConta) {
        super(numConta);
    }

    @Override
    public boolean Sacar(double saque) {
        if (saque > 0 && super.getSaldoConta() > 0) {
            saldoConta -= saque;
            return true;
        }
        return false;
    }

    @Override
    public boolean Depositar(double deposito) {
        if (deposito > 0) {
            saldoConta+= deposito-taxaCC;
            return true;
        }
        return false;
    }

    public String getTipoConta(){
        return "Conta Corrente";
    }
    
}