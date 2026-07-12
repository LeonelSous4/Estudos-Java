package Aula3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class localDate {

    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();

        System.out.println("Data de hoje: " + dataHoje);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data de hoje formatada: " + dataHoje.format(formatador));

    }
    
}
