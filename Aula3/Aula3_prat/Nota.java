package Aula3.Aula3_prat;

public class Nota {
    private double nota1;
    private double nota2;
    private int faltas;

    public Nota() {

    }


    public Nota(double nota1, double nota2, int faltas) {
        setNota1(nota1);
        setNota2(nota2);
        setFaltas(faltas);
    }






    public void setNota1(double nota) {
        if(nota < 0 || nota > 10) {
            System.out.println("Nota inválida");
            return;
        }
        this.nota1 = nota;
    }

    public void setNota2(double nota) {
        if(nota < 0 || nota > 10) {
            System.out.println("Nota inválida");
            return;
        }
        this.nota2 = nota;
    }


    public void setFaltas(int faltas) {
        if(faltas < 0 ) {
            System.out.println("Faltas inválidas");
            return;
        }
        this.faltas = faltas;
    }



    public int getFaltas() {
        return faltas;
    }


    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }



    void resultado() {
        double media = (nota1 + nota2) / 2;

        if (media >= 7 && faltas <= 7) {
            System.out.println("Aprovado com média: " + media + " e faltas: " + faltas);
        } else if (media >= 5 && faltas <= 7) {
            System.out.println("Recuperação com média: " + media + " e faltas: " + faltas);
        } else {
            System.out.println("Reprovado com média: " + media + " e faltas: " + faltas);
        }
    }

}
