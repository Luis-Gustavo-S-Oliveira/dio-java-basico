public class ControleFluxo {

    public static void main(String[] args) {
        // exercicios de if elseif e siwitch
        int mes = 13;
        if (mes == 1){
            System.out.println("janeiro ");
        }     else if (mes == 2){
                  System.out.println("feveiro");
               }    else if (mes == 3){
                        System.out.println("março");
                        } else {
                            System.out.println("esse mes não existe");
                            }
        if (mes == 1){
            System.out.println("ferias");
            }else if (mes == 7){
                System.out.println("ferias");
                }else if (mes == 12){
                    System.out.println("ferias");
                }            

   
        switch (mes) {
            case 1 -> System.out.println("janeiro ");
            case 2 -> System.out.println("feveiro");
            case 3 -> System.out.println("março");
            default -> System.out.println("");
        }
        int numero= 5;

        switch (numero) {
            case 1 ->  System.out.println("errado") ;    
            case 2 ->  System.out.println("errado");
            case 3 ->  System.out.println("errado");
            case 4 ->  System.out.println("certo");
            case 5 ->  System.out.println("talvez");
            default ->  System.out.println("valor indefinido");
            
        }

    


}
}
