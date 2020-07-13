package exemplo01;
public class Gerente extends Funcionario{
    int numFuncionarios;

    
    public Gerente(String nome, double salario,int numFuncionarios) {
        super(nome, salario);
        this.numFuncionarios = numFuncionarios;
    }

    //Polimorfismo
    @Override
    public String exibir(){
        return getNome() +": "+ getSalario() +": "+numFuncionarios;
    }
}