package exercicio06;

public class ContaPoupanca extends Conta {
    protected static double taxaPoup=0.1;

    ContaPoupanca(int numConta) {
        super(numConta);

    }

    @Override
    public boolean Sacar(double saque) {
        saldoConta = saldoConta - (saque+taxaPoup);
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
    
    public String getTipoConta(){
        return "Conta Poupança";
    }    

}