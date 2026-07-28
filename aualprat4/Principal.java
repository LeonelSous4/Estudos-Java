package aualprat4;

public class Principal {

    public static void main(String[] args) {
         Autor autor1 = new Autor("Machado de Assis", "machado@email.com", "Brasileira");

        LivroFisico livroFisico1 = new LivroFisico("Dom Casmurro", autor1, "Romance", 1, 5000, 300);
        livroFisico1.info();

        System.out.println("---");

        LivroDigital livroDigital1 = new LivroDigital("1984", autor1, "Ficcao", 2, 1200, 2.5);
        livroDigital1.info();
    }
    
}
