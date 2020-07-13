package exercicios;
public class Senior extends Funcionarios {
    
    double horaBonus;

    public Senior(String nome,int pagHora,int horaTrabalho,double horaBonus) {
        super(nome,horaTrabalho,pagHora);
        this.horaBonus = horaBonus;
    }
    public double getHoraBonus() {
        return horaBonus;
    }
    @Override
    public double Salario(){
        this.horaBonus=(super.Salario()/10)*getHoraBonus();
        return super.Salario()+this.horaBonus;
    }

}