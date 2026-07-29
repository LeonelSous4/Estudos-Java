package Exercicios;

import java.util.ArrayList;

public class Biblioteca {

    String nome;

    static int totalBibliotecasCriadas = 0;

    ArrayList<Livro> acervo = new ArrayList<>();

   


      Biblioteca(String nome){
        this.nome = nome;
        totalBibliotecasCriadas++;
    }


     void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }



   void listarAcervo() {
    for (int i = 0; i < acervo.size(); i++) {
        System.out.println("----");
                System.out.println("----");

        acervo.get(i).info();
    }
}

}


