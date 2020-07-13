package exemplo03;

public class Pessoa {
    private String nome;
    private Endereco ender;

    public Pessoa(String nome) {
        this.nome = nome;
        ender = new Endereco();
    }

    public Pessoa(String nome, String logradouro, int numero) {
        this.nome = nome;
        ender = new Endereco(logradouro, numero);
    }


    public String exibir() {
        return nome + " : " + ender.exibir();
    }
}