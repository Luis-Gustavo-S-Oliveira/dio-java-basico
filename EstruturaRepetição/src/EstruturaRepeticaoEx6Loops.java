
import java.util.Scanner;

public class EstruturaRepeticaoEx6Loops {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        
    int numero; 
    System.out.print("Escreva um numero para saber seu fatorial : ");
    numero = scan.nextInt();
    
    int fator = 1;
    
        for (int i = numero ; i >= 1 ; i--) {
            
         fator = i * fator;  
        
            
        }
        System.out.print(numero + "! = " + fator );



}
    
}
