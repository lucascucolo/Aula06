package exercicio06;

public class ContaEspecial extends Conta {
    double limite;

    ContaEspecial(int numConta, double limite) {
        super(numConta);
        this.limite = limite;

    }

    public boolean Sacar(double saque) {
        if (saque > 0 && super.getSaldoConta() > 0 && limite > saque) {
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