package exercicios;
public class App {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios("Lucas", 30, 50);
        Senior senior= new Senior("LucasCucolo", 30, 50, 0.1);
        System.out.println(funcionario.Imprimir());
        System.out.println(senior.Imprimir());

    
    }
}