import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("escolho 1 numero inteiro ");
    int numero1 = scanner.nextInt();
    System.out.println("escolho outro numero inteiro maior que o anterior ");
    int numero2 = scanner.nextInt();
    while (numero2 <= numero1) {
        System.out.println("Escolha outro numero maior que o primeiro.");
        numero2 = scanner.nextInt();
    }  
    System.out.println("escolho um numero entre impar ou par ");
    String imparoupar = scanner.next();
    if (imparoupar.equalsIgnoreCase("impar")) {
        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }     
    } else if (imparoupar.equalsIgnoreCase("par")) {
        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    } else {
        System.out.println("Opção inválida. Escolha 'impar' ou 'par'.");
    }
}}