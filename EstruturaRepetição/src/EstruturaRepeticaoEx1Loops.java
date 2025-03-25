
import java.util.Scanner;

public class EstruturaRepeticaoEx1Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String nome;
        int idade;


        while(true){
        System.out.print("nome : ");
        nome = scan.next();
        if (nome.equals("0")) break;

        System.out.print("idade : " );
        idade = scan.nextInt();
        }
        
        System.out.println(" acabou aqui");

    }
}
