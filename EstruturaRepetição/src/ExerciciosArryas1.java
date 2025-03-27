public class ExerciciosArryas1{
    public static void main(String[] args) {
        
        int []vetor = { -5 , 5 ,6, 65, 4, 2};

        //System.out.println(vetor.length); // length retorna o tamanho dos arrays


        int count = 0 ;
       while (count <= (vetor.length -1)){

        System.out.print(vetor[count] + " ");

        count++;

        
       }

       for(int i = (vetor.length - 1); i >= 0; i --){

        System.out.print(vetor[i] + " ");


       }

    }

}