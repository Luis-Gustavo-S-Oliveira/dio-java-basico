import java.util.Scanner; 
    
public class Desafio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        
        int tempoLeitura = paginas/paginasLidas;
        System.out.println(tempoLeitura + " Dias");
        
        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros

    }
}