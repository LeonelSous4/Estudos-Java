package aualprat4;

public class Ingresso {
    private String NomeDoEvento;
    private double Valor;
    


      public Ingresso(String NomeDoEvento, double Valor) {
        this.NomeDoEvento = NomeDoEvento;
        this.Valor = Valor;
        
    }

    public void imprimir(){
        System.out.println("Nome do evento " + this.NomeDoEvento);
                System.out.println("Valor " + this.Valor);

    }
    
}
