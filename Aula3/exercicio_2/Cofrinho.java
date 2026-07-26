package Aula3.exercicio_2;


import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
  
    private List<Moeda> moedas = new ArrayList<>();

   public void adicionar(Moeda moeda) {
        moedas.add(moeda);
    }

   public double calcularTotal() {
    double total = 0;
    for (Moeda m : moedas) {
        total += m.getValor();
    }
    return total;
}
}
