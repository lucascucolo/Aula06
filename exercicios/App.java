package exercicios;
public class App {
    public static void main(String[] args) {
        int horas=8,paghoras=30;

        Funcionarios funcionario = new Funcionarios("Lucas", paghoras, horas);
        Senior senior= new Senior("LucasCucolo", paghoras, horas, 0.1);
        System.out.println(funcionario.Imprimir());
        System.out.println(senior.Imprimir());

    
    }
}