package Aula3.colections;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class principal {
    public static void main(String[] args) {
        // TODO code application logic here

       // ArrayList<String> pessoas = new ArrayList<String>();

        LinkedList<String> pessoas = new LinkedList<String>();


        pessoas.add("Kratos");
        pessoas.add("Atreus");
        pessoas.add("Zeus");
        pessoas.add("Ares");
        System.out.println(pessoas);
        // para ver
        System.out.println(pessoas.get(0));

        pessoas.remove(1);

        System.out.println(pessoas);










        HashMap<String, String> capitais = new HashMap<String, String>();
        capitais.put("Brasil", "Brasilia");
        capitais.put("Argentina", "Buenos Aires");
        capitais.put("Colombia", "Bogota");
        capitais.put("Chile", "Santiago");
        capitais.put("Peru", "Lima");
        capitais.put("Venezuela", "Caracas");

        System.out.println(capitais);
        System.out.println(capitais.get("Brasil"));









        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);

        Collections.sort(numeros);      // ordena: [2, 5, 8]
        System.out.println(numeros);

        Collections.reverse(numeros);   // inverte: [8, 5, 2]
        System.out.println(numeros);

        Collections.shuffle(numeros);   // embaralha aleatoriamente
        System.out.println(numeros);

        System.out.println(Collections.max(numeros));       // retorna o maior valor

        System.out.println(Collections.min(numeros));       // retorna o menor valor










        // ITERATOR

        ArrayList<Integer> lista = new ArrayList<>();
        HashSet<Integer> conjunto = new HashSet<>();
        HashMap<Integer, String> mapa = new HashMap<>();

        int soma;

        soma = 0;

        for (int i = 0; i < lista.size(); i++) {
            soma += lista.get(i);
        }


        // for each

        soma = 0;
        // para cada item dentro da lista ele vai somar o item
        for(int item : lista) {
            soma += item;
        }
        













    }
    
}
