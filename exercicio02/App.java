package exercicio02;
public class App {
    public static void main(String[] args) {
        int horas=12,paghoras=30;


        GerenciaFunc func = new GerenciaFunc();
        func.addFuncionarios("Lucas", paghoras, horas);
        func.addFuncionarios("Joao", paghoras, horas);
        func.addFuncionarios("Andre", paghoras, horas);
        func.addFuncionarios("Claudia", paghoras, horas);
        func.addSenior("Jana", paghoras, horas, 0.1);
        
        
        System.out.println("-------------------");
        System.out.println(func.removerFuncionario("Lucas"));
        System.out.println(func.listarTodos());


       // System.out.println(funcionario.Imprimir());
       // System.out.println(senior.Imprimir());

    
    }
}