package exemplo03;

public class Endereco {
    private String logradouro;
    private int numero;


    public Endereco(){}

    public Endereco(String logradouro, int numero){
        this.logradouro = logradouro;
        this.numero = numero;
    }
    
    public String exibir(){
        return logradouro +" - "+numero;
    }
}