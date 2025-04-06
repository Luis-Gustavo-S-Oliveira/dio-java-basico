package collections.list;

import java.util.ArrayList;
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

    System.out.print("Exiba a terceira nota adicionada ");

    System.out.println("Exiba a menor nota : ");

    System.out.print("Exiba a maior nota : ");


 } 
}
