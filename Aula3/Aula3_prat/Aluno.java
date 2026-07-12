package Aula3.Aula3_prat;

public class Aluno {
    
    public static void main(String[] args) {

        Nota Leo = new Nota();
        Leo.setNota1(10);
        Leo.setNota2(8);
        Leo.setFaltas(11);

        Leo.resultado();




        Leo.setNota1(5);
        Leo.setNota2(5);
        Leo.setFaltas(5);

        Leo.resultado();



        Leo.setNota1(3);
        Leo.setNota2(4);
        Leo.setFaltas(2);

        Leo.resultado();

    }
}
