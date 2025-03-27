
import java.util.Random;

public class ExerciciosArryas3 {
    public static void main(String[] args) {
        Random random = new Random();

        int [] numero = new int [20];

        for (int i = 0 ; i < numero.length; i++) {
            int num = random.nextInt (100);

            numero[i] = num; 
            
        }
        
        System.out.println(" numeros aleatorias ");
        for ( int num : numero) {
            System.out.print(num + " ");
            
        }

        System.out.println(" Sucessores dos numeros : ");
        for ( int num : numero) {
            System.out.print(++num + " ");
            
        }

    }
    
}
