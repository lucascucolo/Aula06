package exercicio06;

public abstract class Conta {
    int numConta;
    protected double saldoConta;

    public Conta(int numConta) {
        this.numConta = numConta;
        saldoConta=0;
    }

    public abstract boolean Depositar(double deposito);

    public abstract boolean Sacar(double saque);
//-------------get / set-----------

public double getSaldoConta() {
    return saldoConta;
}

public int getNumConta() {
    return numConta;
}

//------------------------------------    
}