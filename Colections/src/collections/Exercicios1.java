package collections;

import java.util.ArrayList;
import java.util.List;



public class Exercicios1 {

    public static void main(String[] args) {


    List <String> perguntas = new ArrayList<>();
    perguntas.add( "telefonou para a vitima ? ");
    perguntas.add( "mora perto da vitima ? ");
    perguntas.add( "ja trabalhou com a vitima ? ");
    perguntas.add( "devia para a vitima  ? ");
    perguntas.add( "estava no local do crime ? ");

    List <Boolean> crime = new ArrayList <> ();
    crime.add(true);
    crime.add(false);
    crime.add(true);
    crime.add(false);
    crime.add(true);
    
        double soma = 0.0;
            for (int i = 0; i < crime.size(); i++) {

                System.out.println(perguntas.get(i) + crime.get(i));
                
                if (crime.get(i) == true){
                    soma += 1;

                    
                }
            


            }
        
        System.err.println(soma);

        if (soma == 2 ){

        System.out.print("suspeito");

            }else if (soma == 3  ){

            System.out.print("cumplice");

                }else if (soma == 4){

                System.out.println(" Cumplice ");

                    }else if (soma == 5 ){

                        System.out.print("assasino ");
                            }else System.out.println(" inocente ");

    }




}

