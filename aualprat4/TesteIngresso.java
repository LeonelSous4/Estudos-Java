package aualprat4;

public class TesteIngresso {
    

    public static void main(String[] args) {
         Ingresso ingresso1 = new Ingresso("Show do Coldplay", 250.00);
        ingresso1.imprimir();

        System.out.println("---");

        // Teste com IngressoVip
        IngressoVip ingressoVip1 = new IngressoVip("Show do Coldplay", 250.00, 100.00);
        ingressoVip1.imprimir();
    }
}
