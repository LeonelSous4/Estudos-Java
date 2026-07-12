package Aula3.encap;

public class hora {

    private int hora;
    private int minuto;
    private int segundos;

    public int getHora() {
        return hora;

    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        }else {
            System.out.println("Hora inválida");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido");
        }
    }

    public int getSegundo() {
        return segundos;
    }

    public void setSegundo(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } else {
            System.out.println("Segundo inválido");
        }
    }
}
