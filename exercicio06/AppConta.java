package exercicio06;

public class AppConta {
    public static void main(String[] args) {
        GerenciarContas contas = new GerenciarContas();
        contas.addContaCorrente(123);
        contas.addContaEspecial(234, 100);
        contas.addContaPoupanca(345);


        contas.Depositar(100, 123);

        System.out.println(contas.listarContas());
    }
}