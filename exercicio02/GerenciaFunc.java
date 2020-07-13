package exercicio02;

import java.util.ArrayList;

public class GerenciaFunc {
    private ArrayList<Funcionario> funcionarios;

    public GerenciaFunc(){
        funcionarios = new ArrayList<>();
    }

    public void addFuncionarios(String nome, int pagHora, int horaTrabalho){
        Funcionario func = new Funcionario(nome, pagHora, horaTrabalho);
        funcionarios.add(func);
    }

    public void addSenior(String nome,int pagHora,int horaTrabalho,double bonus){
        Senior senior= new Senior(nome, pagHora, horaTrabalho, bonus);
        funcionarios.add(senior);
    }

    public String listarTodos(){
        String saida = "";

        for (Funcionario func : funcionarios){
            saida += func.Imprimir() + "\n";
        }
        return saida;
    }

    public String listarTodosSenior(){
        String saida = "";

        for (Funcionario func : funcionarios){
            if(func instanceof Senior){
            saida += func.Imprimir() + "\n";
            }
        }
        return saida;
    }
}