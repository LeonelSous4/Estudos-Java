package Aula3.Aula3_prat;

public class ALuno {

    private String nome;
    private int matricula;
    private double desconto;
    private Curso curso;

    public ALuno() {
    }



    public ALuno(String nome, int matricula, double desconto, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.desconto = desconto;
        this.curso = curso;
       
    }










  
    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getDesconto() {
        return desconto;
    }

    public Curso getCurso() {
        return curso;
    }


public void setNome(String nome) {
    this.nome = nome;
}

public void setMatricula(int matricula) {
    this.matricula = matricula;
}

public void setDesconto(double desconto) {
    this.desconto = desconto;
}

public void setCurso(Curso curso) {
    this.curso = curso;
}


public void descrever() {
    System.out.println("Nome: " + nome);
    System.out.println("Matrícula: " + matricula);
    System.out.println("Desconto: " + desconto);
    System.out.println("Curso: " + curso.getNome());
    System.out.println("Mensalidade: " + curso.getMensalidade());
}

public void calcularDesconto() {
    double valorComDesconto = curso.getMensalidade() - (curso.getMensalidade() * desconto);
    System.out.printf("Valor com desconto: %.2f%n", valorComDesconto);






}
   
}

