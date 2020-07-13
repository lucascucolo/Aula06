package exercicio04;

import java.util.Scanner;

public class AppAnimalProprietario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner cadastro = new Scanner(System.in);
        String nomeAnimal,raca,nomeProprietario;
        int numTelefone,opcao;
        Gerenciar animal = new Gerenciar();
        opcao=9999;

        do{
            System.out.println("1 - cadastrar Animal");
            System.out.println("2 - remover Animal");
            System.out.println("3 - Listar todos cadastrados");
            System.out.println("4 - Listar por raça");
            System.out.println("0 - sair do programa");
            opcao=in.nextInt();
            switch (opcao) {
                case 1:
                System.out.println("qual o nome do Animal vc quer adicionar?");
                nomeAnimal=cadastro.nextLine();
                System.out.println("qual a raça do animal");
                raca=cadastro.nextLine();
                System.out.println("qual o nome do Proprietario");
                nomeProprietario=cadastro.nextLine();
                System.out.println("qual o telefone do proprietario?");
                numTelefone=in.nextInt();
                animal.addAnimal(nomeAnimal, raca, nomeProprietario,numTelefone);
                System.out.println("===> Animal Cadastrado");
                    break;
                case 2:
                System.out.println("qual o nome do Animal vc quer remover?");
                nomeAnimal=cadastro.nextLine();
                animal.removerAnimal(nomeAnimal);
                    break;
                case 3:
                System.out.println(animal.listarTodos());
                    break;
                case 4:
                System.out.println("qual raça vc quer listar?");
                raca=cadastro.nextLine();
                System.out.println(animal.listarTodosRaca(raca));
                    break;
            
            
                default:
                    break;
            }


        }while(opcao!=0);
        in.close();
        cadastro.close();
    }
}