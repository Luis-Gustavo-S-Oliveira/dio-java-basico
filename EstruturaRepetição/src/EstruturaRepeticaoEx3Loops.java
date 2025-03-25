
import java.util.Scanner;

public class EstruturaRepeticaoEx3Loops{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        double media = 0;
        int maior = 0;
        int count = 0;
        do { 
            System.out.print(" numero : ");
            numero = scan.nextInt();
                if (numero > maior )
                maior = numero;

            media = media + numero;
            ++count;
             

        } while (count < 5);
    
    media = media /count;

    System.out.print("maior numero é " + maior);
    System.out.print(" a media é " + media);

    }
}