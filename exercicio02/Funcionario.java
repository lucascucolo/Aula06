package exercicio02;

public class Funcionario {
    private String nome;
    private int horaTrabalho,pagHora;
    
    public Funcionario(String nome, int pagHora, int horaTrabalho) {
        this.nome = nome;
        this.pagHora = pagHora;
        this.horaTrabalho = horaTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoraTrabalho() {
        return horaTrabalho;
    }

    public void setHoraTrabalho(int horaTrabalho) {
        this.horaTrabalho = horaTrabalho;
    }

    public int getPagHora() {
        return pagHora;
    }

    public void setPagHora(int pagHora) {
        this.pagHora = pagHora;
    }

    public double Salario(){
        return  (getPagHora()*getHoraTrabalho());
        
    }

    public String Imprimir(){
        return "Funcionario "+getNome()+ " receberá "+ Salario();
    }
}