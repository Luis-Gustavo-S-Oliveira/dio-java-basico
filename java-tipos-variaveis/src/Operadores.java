public class Operadores {

    public static void main(String[] args) throws Exception {
        int numero = 5;

        numero++; // numero = numero + 1

        System.out.print(numero ++); //Unario (++) utilizado desse jeito faz com q aconteça a soma apos a impressão
        
        System.out.print(numero);

        System.out.print(numero --);
        numero = - numero;

        System.out.print(numero); //Unairo (-) faz com que todas as operações sejam negativas 

        Boolean variavel = true;

        System.out.print(!variavel);


    }

    public static void master(String[] args) throws Exception {
        int a, b;

        a = 5;
        b = 6;
        String resultado = "";
        if (a == b)
            resultado = "verdadeiro";
        else 
            resultado = "falso";
  
        // String resultado = a==b ? "verdadeiro" : "falso"----> jeito de simplificar com o ternario(nao se limita a String)
    }
}
