package exercicio04;

import java.util.ArrayList;

public class Gerenciar {
    private ArrayList<Animal> animais;

    public Gerenciar(){
        animais = new ArrayList<>();
    }

    public void addAnimal(String nomeAnimal, String raca,String nomeProprietario,int numTelefone){
        Animal animal = new Animal(nomeAnimal, raca,nomeProprietario,numTelefone);
        animais.add(animal);
    }

    public String listarTodos(){
        String saida = "";

        for (Animal animal : animais){
            saida += "------------ "+ animal.Exibir() + "\n";
        }
        return saida;
    }

    public String listarTodosRaca(String raca){
        String saida = "";

        for (Animal animal : animais){
            if(animal.getRaca().equals(raca)){
            saida += "------------ "+ animal.Exibir() + "\n";
            }
        }
        return saida;
    }

    public boolean removerAnimal(String nome){
        for (Animal animal : animais) {
            if(animal.getNomeAnimal().equals(nome)){
                animais.remove(animal);
            }
            return true;
        }
        return false;
    }

}