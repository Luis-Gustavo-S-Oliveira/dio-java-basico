public class Horarios {

    public static void horas(int hora){

    if (hora > 6 && hora < 12){

        System.out.println(" Bom dia");

            }else if (hora > 12 && hora < 18 ){

                System.out.println("Boa tarde");
            
                    }else if(hora > 18 && hora < 24 | hora < 6 && hora >= 0){

                        System.out.print("Boa Noite");

                        }else System.out.print("Horarios invalido");
    }
    
}
