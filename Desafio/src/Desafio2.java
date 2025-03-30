
import java.util.Scanner; 
    
public class Desafio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        
        if (tamanho < 1 || tamanho > 10){
          System.out.println("Porcentagem invalida ");
        } else {
          for (int i = 0; i < tamanho; i++ ){
            System.out.print("/");
          }
        
        }  
        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download

    }
}