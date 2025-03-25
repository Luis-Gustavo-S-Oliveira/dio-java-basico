
import java.util.Scanner;

public class EstruturaRepeticaoEx4Loops { 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
       int numero ; 
       int quantNumero ;
       int contador = 0;
       int negativo = 0;
       int positivo = 0 ;

       System.out.print(" Quantidade de numeros : ");
       quantNumero = scan.nextInt();
        
        do {
            System.out.print(" Digite um numero : ");
            numero = scan.nextInt();
            if (numero % 2 == 0){
                positivo++ ;
                }else  negativo++;


            contador++;
            

        } while (contador < quantNumero);

        System.out.print(" Numeros negativos : " + negativo);
        System.out.print(" Numeros positivos : " + positivo);


    }




}