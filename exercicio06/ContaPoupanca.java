package exercicio06;

public class ContaPoupanca extends Conta {

    ContaPoupanca(int numConta) {
        super(numConta);

    }

    @Override
    public boolean Sacar(double saque) {
        saldoConta -= saque;
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