package Exercicios;

public class Principal {
    public static void main(String[] args) {
        Biblioteca bibCentral = new Biblioteca("Biblioteca Central");
        Biblioteca bibComunitaria = new Biblioteca("Biblioteca Comunitária");

    Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
    Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");
    Livro livro3 = new Livro("1984", "George Orwell");
    Livro livro4 = new Livro("O Hobbit", "J.R.R. Tolkien");
    Livro livro5 = new Livro("Grande Sertão: Veredas", "João Guimarães Rosa");
    Livro livro6 = new Livro();


        bibCentral.adicionarLivro(livro1);
        bibCentral.adicionarLivro(livro2);
        bibCentral.adicionarLivro(livro3);
        bibComunitaria.adicionarLivro(livro4);
        bibComunitaria.adicionarLivro(livro5);
        bibComunitaria.adicionarLivro(livro6);


        livro1.emprestar();
        livro2.emprestar();

        
        System.out.println(" ----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço");
       
        livro1.emprestar();
        livro2.devolver();
        livro5.devolver();

        System.out.println(" ----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço");


        livro1.info();

        System.out.println(" ----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço");

        livro3.info();

        System.out.println(" ----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço");

        livro6.info();

        System.out.println(" ----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço");


        bibCentral.listarAcervo();

        System.out.println(" ----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço----Espaço");

        bibComunitaria.listarAcervo();

        System.out.println("Total de bibliotecas criadas: " + Biblioteca.totalBibliotecasCriadas);


       


    }
}


