package exercicio04;

public class Proprietario {
    private String nomeProprietario;
    private int numTelefone;
    
    Proprietario(String nomeProprietario, int numTelefone) {
        this.nomeProprietario = nomeProprietario;
        this.numTelefone = numTelefone;
    }

    Proprietario(String nomeProprietario){
        this.nomeProprietario = nomeProprietario;
    }


    public String Exibir(){
        return "Proprietario: "+nomeProprietario+", Telefone: "+numTelefone;
    }



}