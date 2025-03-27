
import java.util.Random;

public class ExerciciosArryas4{
    public static void main(String[] args) {
        Random random = new Random();

        int [][] numero = new int [4][4];

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0;  j < numero[i].length; j++) {
                numero [i][j] = random.nextInt(9);
            }

            
        }

        System.out.println("Matriz : ");

        for (int[] linha : numero) {
            for (int coluna : linha) {
                
                System.out.print(coluna + " ");
            }
            
            System.out.println();
        }
    }


}