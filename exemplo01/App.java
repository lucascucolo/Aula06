package exemplo01;
public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Lucas",3000,8);

    //    gerente.teste();
        System.out.println(gerente.exibir());

        System.out.println(gerente.toString());
    }
}