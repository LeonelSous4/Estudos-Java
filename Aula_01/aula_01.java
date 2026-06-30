
import java.util.Scanner;

public class aula_01 {
    
    public static void main(String[] args) {

        // variaveis com ; no final e precisam ser tipadas
        // int = inteiro 

        int idade = 10;

        // tanto como double como float mostram ponto flutuante,
        // double aceita mais caracteres e é mais usado
        // pra usar float precisa pro f

        float valor = 2.4f;
        double peso = 67.5;
        idade = idade + 2;
        // char usado pra tipar letras

       
        
        // lendo dados, do teclado. o system.in é o teclado

        Scanner teclado = new Scanner(System.in);

        System.out.println("digite idade, peso e nome");

        String nome = "Leonel";
        
        idade = teclado.nextInt();
        peso = teclado.nextDouble(); 
        // para ler string apenas next;
        nome = teclado.next();

         System.out.println("idade: " + (idade + 2));

        // a variavel idade vai aparecer em %d

        System.out.printf("idade: %d\n", idade);
        System.out.printf("peso: %.1f\n", peso);
        System.out.println("Nome: " + nome);

        if(idade < 18) {
            System.out.println("Acesso negado");
        }
        else if(idade > 65) {
            System.out.println(" muito velho");
        }

        

        for( int i = 0; i<10; i++) {
            System.out.println("Valor:" + i );

        }

        //array igual ao js, so que precisa tipar no inicio
        // Arraylist
        int megaSEna[] = {11,123,2,243,32,54,5354,3};

        int numeros[] = new int[200];

        numeros[60] = 50;


        double result = Math.pow(2,3);

        System.out.println(result);

        
    }
}