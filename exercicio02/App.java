package exercicio02;
public class App {
    public static void main(String[] args) {
        int horas=10,paghoras=30;


        GerenciaFunc func = new GerenciaFunc();
        func.addFuncionarios("Lucas_func", paghoras, horas);
        func.addSenior("Lucas_Senior", paghoras, horas, 0.1);

        System.out.println(func.listarTodos());
        System.out.println("-------------------");
        System.out.println(func.listarTodosSenior());

       // System.out.println(funcionario.Imprimir());
       // System.out.println(senior.Imprimir());

    
    }
}