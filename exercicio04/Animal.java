package exercicio04;

public class Animal {
    private String nomeAnimal,raca;
    private Proprietario nomeProprietario;

    public Animal(String nomeAnimal, String raca, String prop,int numTelefone) {
        this.nomeAnimal = nomeAnimal;
        this.raca = raca;
        nomeProprietario = new Proprietario(prop,numTelefone);
    }

    Animal(String nomeAnimal, String raca) {
        this.nomeAnimal = nomeAnimal;
        this.raca = raca;
    }

    public String Exibir(){
        return "Nome do Animal: "+nomeAnimal+", raça: "+raca+",  "+nomeProprietario.Exibir();
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public Proprietario getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(Proprietario nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    
    
    
    
}