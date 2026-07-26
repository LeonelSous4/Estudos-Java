package Aula3.Aula3_prat;

public class TesteAluno {

    public static void main(String[] args) {

        // Cria o objeto Curso e preenche seus dados
        Curso java = new Curso();
        java.setNome("Java");
        java.setMensalidade(500.0);

        // Cria o objeto ALuno e preenche seus dados
        ALuno leo = new ALuno();
        leo.setNome("Leo");
        leo.setMatricula(2026001);
        leo.setDesconto(0.1); // 10% de desconto
        leo.setCurso(java);   // associa o objeto Curso ao ALuno

        // Testa os métodos
        leo.descrever();
        leo.calcularDesconto();



        ALuno leo2 = new ALuno("Chicoo", 87674816, 0.8, new Curso("python", 922.0));

        leo2.descrever();
        leo2.calcularDesconto();


        

    }
}




      

