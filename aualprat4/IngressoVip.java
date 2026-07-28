package aualprat4;

public class IngressoVip extends Ingresso {

       public double adicional;

    public IngressoVip(String nomeEvento, double valor, double adicional) {
        super(nomeEvento, valor); // chama o construtor de Ingresso
        this.adicional = adicional;
    }

    public void imprimir() {
        super.imprimir(); // opcional: reaproveita o imprimir da mãe
        System.out.println("Adicional: " + adicional);
    }


}
