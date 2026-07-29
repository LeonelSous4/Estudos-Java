package Exercicios;

public class Livro {
    String titulo;
    String autor;
    boolean emprestado; 

    Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    Livro(){
        
    }

  public void emprestar(){
    if(this.emprestado){
        System.out.println("Livro já emprestado");
    } else {
        this.emprestado = true;
        System.out.println("Livro emprestado com sucesso");
    }
}

    public void devolver(){
    if(!this.emprestado){
        System.out.println("Livro já disponível, comando inválido");
    } else {
        this.emprestado = false;
        System.out.println("Livro devolvido");
    }
}

    public void info(){
    System.out.println("Titulo: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    if(this.emprestado){
        System.out.println("Status: livro indisponivel(emprestado)");
    }else{
        System.out.println("Status: livro Disponivel");
    }
}

   
}
