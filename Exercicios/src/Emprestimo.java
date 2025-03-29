public class Emprestimo {
    public static int quantidadeParcela2 () {
       return 2;
    }
    public static int quantidadeParcela3 () {
        return 3;
    }

    public static double  taxa2Parcelas () {
        return 0.3;
    }

    public static double  taxa3Parcelas () {
        return 0.45 ;
    }

    public static void valorEmprestimo(double valor, int parcela){
        
        switch (parcela) {
            case 2 ->                 {
                    double valorFinal = valor + (valor * taxa2Parcelas());
                    System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
                }
            case 3 ->                 {
                    double valorFinal = valor + (valor * taxa3Parcelas());
                    System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
                }
            default -> System.out.println("Quantidade de parcelas não aceita.");
        }

    }
    
}
