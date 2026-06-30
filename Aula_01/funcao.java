import java.util.Scanner;

public class funcao {
    public static void main(String[] args) {
        System.out.println("Java na nuvem funcionando!");


        
        double result = Math.pow(2,3);

        System.out.println(result); 

        int idade;
        Scanner teclado = new Scanner(System.in);

        // System.out.println("digite sua idade");
        // idade = teclado.nextInt();
        // System.out.println("idade:" + idade );

        // Listas

        // array

        int[] notas = new int[3];

        System.out.println( notas );

        notas[0] = 3;
        notas[1] = 7;
        notas[2] = 22;

        // [I@15d9bc04 isso que o rpint mostrou, para mostrar 
        // os itens usasse o for para percorrer

        for (int n : notas) {
            System.out.println(n);
        }


    }
}
