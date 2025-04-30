import java.util.*;

public class Desafio1 {

    public static void main(String[] args) {
   

        Scanner scanner = new Scanner(System.in);

        
        int i = scanner.nextInt();        // Lê o inteiro
        double d = scanner.nextDouble();  // Lê o double
        scanner.nextLine();               // Limpa a quebra de linha pendente
        String s = scanner.nextLine();     // Lê a String

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scanner.close();
    }

    }