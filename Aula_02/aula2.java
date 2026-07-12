package Aula_02;

public class aula2 {
    
    // classes e atributos 

    public static void main(String[] args) {

        System.out.println("aprendendo classes");

        aluno a = new aluno();

        a.matricula = 1001;
        a.nome = "chico";
        a.cpf = "00121066566";

         System.out.println("Matricula:" + a.matricula );
                 System.out.println("nome:" + a.nome );
                       System.out.println("cpf:" + a.cpf );



        a.info();

        a.nome = "camaleao";

        a.info();

        aluno b = new aluno();
        b.matricula = 785237522;
        b.nome = "cesar";
        b.cpf = "8979898009";

        b.info();


       

        // METODOS SÃO AS FUNÇÕES, 
        // ATRIBUTOS SÃO A COMPOSIÇÃO DO OBJETO, 
        // ESTADO É EM QUAL SITUAÇÃO ELE ESTA



        // carro

        carro c = new carro();
        System.out.println("milhas em metros:" + carro.milhasParaMetros(20));



        
    }

}
