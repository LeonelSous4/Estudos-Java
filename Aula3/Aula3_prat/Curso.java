package Aula3.Aula3_prat; 

public class Curso {
    private String nome;
    private double mensalidade;


    public Curso() {
    }

    public Curso(String nome, double mensalidade) {
        this.nome = nome;
        this.mensalidade = mensalidade;
    }











    public String getNome() {
        return nome;
    }

    public double getMensalidade() {
        return mensalidade;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }


public void descrever() {
    System.out.println("Nome: " + nome);
    System.out.println("mensalidade: " + mensalidade);
}

}