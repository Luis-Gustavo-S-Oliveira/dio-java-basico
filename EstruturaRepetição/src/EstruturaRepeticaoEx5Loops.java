
import java.util.Scanner;

public class EstruturaRepeticaoEx5Loops {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    
    int numero;
    System.out.print("digite um numero : ");
    numero = scan.nextInt();
    
    for (int i = 1; i <= 10; i++ ) {
        
        System.out.print( numero + " x " + i + " = " + (numero * i) );
        
    }

}
}
