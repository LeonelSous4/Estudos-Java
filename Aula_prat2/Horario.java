public class Horario {
    int hora;
    int minuto;
    int segundo;


Horario(int hora, int minuto, int segundo) {
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;

    if (hora >= 0 && hora <= 23) {
    this.hora = hora;    
    System.out.println("Hora válida!. hora: " + hora);
    } else {
        this.hora = 0;          
        System.out.println("Hora inválida! Definindo como 0.\n");
    }


    if (minuto >= 0 && minuto <= 59) {
        this.minuto = minuto;
        System.out.println("Minutos válidos!. minuto: " + minuto);
    } else {
        this.minuto = 0;          
        System.out.println("MInutos inválidos! Definindo como 0.\n");
    }


    if (segundo >= 0 && segundo <= 59) {
        this.segundo = segundo;
        System.out.println("Segundos válidos!. segundo: " + segundo);
    } else {
        this.segundo = 0;          
        System.out.println("segundos inválidos! Definindo como 0.\n");
    }


}

Horario(int hora) {

        if (hora >= 0 && hora <= 23) {
    this.hora = hora;    
    System.out.println("Hora válida!. hora: \n" + hora);
    } else {
        this.hora = 0;          
        System.out.println("Hora inválida! Definindo como 0. \n");
    }

}

Horario() {

}

public static void main(String[] args) {
    Horario horas = new Horario(22,35,34);

        Horario hora2 = new Horario(25,35,34);

            Horario hora3 = new Horario(22,60,34);

                Horario horas4 = new Horario(22,35,72);



}



}