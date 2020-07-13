package exercicios;
public class Senior extends Funcionarios {
    
    private double bonus;

    public Senior(String nome,int pagHora,int horaTrabalho,double bonus) {
        super(nome,pagHora,horaTrabalho);
        this.bonus = bonus;
    }
    public double getBonus() {
        return this.bonus;
    }
    @Override
    public double Salario(){
        double salario;
        if(getHoraTrabalho()>=10){
        salario=(super.Salario())+(super.Salario()*getBonus());
        }else{
        salario=super.Salario();
        }
        return salario;
    }

}