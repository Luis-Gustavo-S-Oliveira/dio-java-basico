package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class exercicio {
    public static void main(String[] args) {
        
        List<String> meses = List.of("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho");

        System.out.println("Temperatura media dos primeiros 6 meses do ano ");
        List <Double> temperatura = new ArrayList<>();

        temperatura.add(50.0);
        temperatura.add(20.0);
        temperatura.add(29.5);
        temperatura.add(36.5);
        temperatura.add(28.4);
        temperatura.add(26.5);

        Iterator<Double> iterator = temperatura.iterator();
        double soma = 0.0;
            while (iterator.hasNext()){
            Double next = iterator.next();
            soma +=next;

            }
        System.out.println("a media de temperatura é " + soma/temperatura.size());
        
        Double media = soma/temperatura.size();

        for (int i = 0; i < temperatura.size() ; i++) {
          if (temperatura.get(i) > media) {
          System.out.println( " mes " + meses.get(i) + " é " + temperatura.get(i) );
          }
        }
        
        
       /* 
        
        if (temperatura.get(1) > soma/temperatura.size());
            System.out.println("janeiro - " + temperatura.get(1) );
        else 
             
            */
        
        
    }
}
