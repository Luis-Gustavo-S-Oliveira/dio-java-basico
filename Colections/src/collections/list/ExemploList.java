package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        
    System.out.println("Crie uma lista e adicione as sete notas ");
    List <Double> notas = new ArrayList<>();
    
    notas.add(7.3);
    notas.add(6.0);
    notas.add(3.4);
    notas.add(7.0);
    notas.add(0.0);
    notas.add(10.0);
    notas.add(4.7 );

    System.out.println(notas.toString()); //toString é "opicional"  

     System.out.println("Exiba a posição da nota 4.7 = " + notas.indexOf(4.7));

    System.out.println("Adicione na lista a nota 8.0 na posição 4 "  );
    notas.add(4, 8.0);
    System.out.println(notas);

    System.out.println("Substitua a nota 6.0 pela nota 5.0");
    notas.set(notas.indexOf(6.0),5.0);
    System.out.println(notas);

    System.out.println(" Confira se a nota 5.0 está na lista :  " + notas.contains(5.0));
     
    /*  System.out.println("Exiba todas as notas na ordem em que foram informadas : ");
    System.out.print(notas); */

    System.out.println("Exiba a terceira nota adicionada " + notas.get(2));

    System.out.println("Exiba a menor nota : " + Collections.min(notas));

    System.out.println("Exiba a maior nota : " + Collections.max(notas));

    System.out.println("Exiba a soma dos valores");
    Iterator<Double> iterator = notas.iterator();
    double soma = 0.0;
    while (iterator.hasNext()){
        Double next = iterator.next();
        soma +=next;

    }
    System.out.println("Exiba a soma dos valores" + soma);

    System.out.println("Exiba a media das notas : " + (soma/notas.size()));


    System.out.println("Remova a nota 0 ");
    notas.remove(0.0);
    System.out.println(notas);

    System.out.println("Remova a nota na posição 0");
    notas.remove(0.0);
    System.out.println(notas);

    System.out.println(" Remova as notas menores que 7 ");
    Iterator<Double> iterator1 = notas.iterator(); // transformou a lista em um iterator 
    while(iterator1.hasNext()){ // perguntou se dentro do interator1 tem um proximo
        Double next = iterator.next(); // colocou o proxima iterator1 dentro da variavel next 
        if(next < 7) iterator1.remove(); // se next for menos que 7 ele é removido 

    }
    System.out.println(notas);

    System.out.println("apague toda a lista");
    notas.clear();
    System.out.println(notas);

    System.out.println("Confira se a lista esta vazia " + notas.isEmpty());





 } 
}
