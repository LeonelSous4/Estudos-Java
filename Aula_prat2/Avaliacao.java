public class Avaliacao {

    double nota1;
    double nota2;
    double nota3;

    double calcMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    double calcMediaPond() {
        return (nota1*2 + nota2*3 + nota3*4) / 9;
    }

    public static void main(String[] args) {
        Avaliacao aval = new Avaliacao();
        aval.nota1 = 9;
        aval.nota2 = 7;
        aval.nota3 = 8.5;

        double media = aval.calcMedia();
        double mediaPond = aval.calcMediaPond();

        System.out.println("Média: " + media);
        System.out.println("Média Ponderada: " + mediaPond);
    }
}
