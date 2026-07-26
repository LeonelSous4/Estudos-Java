package Aula3.exercicio_2;

public class TesteCofrinho {

    public static void main(String[] args) {

        Cofrinho cofre = new Cofrinho();

        Moeda umReal = new Moeda(1.0, "Um Real");
        Moeda cinquentaCentavos = new Moeda(0.5, "Cinquenta Centavos");
        Moeda vinteCincoCentavos = new Moeda(0.25, "Vinte e Cinco Centavos");

        cofre.adicionar(umReal);
        cofre.adicionar(cinquentaCentavos);
        cofre.adicionar(vinteCincoCentavos);

        double total = cofre.calcularTotal();
        System.out.println("Total no cofrinho: " + total);
    }
}