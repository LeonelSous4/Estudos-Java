package Aula4;

public class Livro {
    public String[] autor;
    public float custoProdução;
    public float precoVenda;
    public String titulo;
    public int paginas;

    

    public Livro(String titulo, String autor){

    }


    public float lucro() {
        return precoVenda - custoProdução;
    }

    public void imprimirTitulo() {
        System.out.println("O titulo" + titulo);
    }

    public float imposto() {
        return 0.2f * lucro();
    }
}
