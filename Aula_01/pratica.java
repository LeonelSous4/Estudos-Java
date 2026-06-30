
import java.util.ArrayList;
import java.util.Scanner;


public class pratica {
    
    public static void main(String[] args) {
        
        // int peso;
        // double altura;


        // Scanner teclado = new Scanner(System.in);

        // // System.out.println("digite seu peso e altura");

        // peso = teclado.nextInt();
        // altura = teclado.nextDouble(); 

        // double resultado = peso / (Math.pow(altura, 2));

        // System.out.printf("imc: %.1f\n", resultado);



        // exercicio 2

    Scanner palpite = new Scanner(System.in);

    System.out.println("digite um numero");

        int correto = 10000;
        int numero = palpite.nextInt();

        

        while (numero != correto) {

            if(numero > correto) {
                System.out.println("numero muito grande digite um numero menor");
                        System.out.println("digite um numero menor");

            }

        else {
             System.out.println("numero muito pequeno digite um numero maior");
            
                System.out.println("digite um numero maior");

        }

        numero = palpite.nextInt();

         
            
        }

        System.out.println("numero correto");


        // exercicio 3

            ArrayList<int> MegaSena = new ArrayList<int>();

        
        // usa array lis pois ele tem metodos, tipo o array do js

            ArrayList<String> listaNomes = new ArrayList<String>();

       


    }
}
