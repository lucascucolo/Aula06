package exercicio06;

public class ContaCorrente extends Conta {

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
            saldoConta+= deposito;
            return true;
        }
        return false;
    }
    
}