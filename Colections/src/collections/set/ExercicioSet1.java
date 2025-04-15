package collections.set;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSet1 {
    
    public static void main(String[] args) {
        
    
    System.out.print ("Cores do arco-íris "); 
        Set<String> coresArcoIris = new HashSet<>(Arrays.asList("preto","azul","amarelo","vermelho","roxo","verde","violeta"));
       
        System.out.println(coresArcoIris);
    
    /*System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }
    */
    System.out.println("Exiba a quantidade de cores que o arco-íris tem : ");
    System.out.println(coresArcoIris.size());

    System.out.println("--\tOrdem Alfabetica\t--");
        Set<String> cor2  = new TreeSet<>(coresArcoIris);
        cor2.addAll(coresArcoIris);
        System.out.println(cor2);
        List<String> cor3 = new ArrayList<>(cor2);
        Collections.reverse(cor3);
        System.out.println("--\tOrdem inversa\t--");
        System.out.print(cor3);

        System.out.println("Exiba todas as cores que comecam com v :");
        for (String corV : coresArcoIris) {
            if(corV.startsWith("v")) System.out.println(corV);
        }

        System.out.println("Remova todas as cores que começam com v  ");
        
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }

        System.out.print(coresArcoIris);

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }
}
