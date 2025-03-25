
import java.util.Scanner;

public class EstruturaRepeticaoEx2Loops{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int nota ;

        while(true){
            System.out.print(" nota : ");
            nota = scan.nextInt();
            if (nota < 0 || nota >10){
                System.out.print("nota invalida ");
                }else break;                
                    
            

        }

        while (nota < 0 || nota > 10){
            System.out.print("nota invalida, digite novamente : ");
            nota = scan.nextInt();
        }


    }
}