public class Usuario{
    

    public static void main(String [] args)throws Exception{

        SmartTvs smartTvs = new SmartTvs ();

        System.out.println ("Tv ligada ? " + smartTvs.ligado);

        System.out.println ("canal atual : " + smartTvs.canal);
        
        System.out.println ("volume atual : " + smartTvs.volume);

        smartTvs.ligar(); 
        System.out.println ("Novo estado --> Tv ligada ? " + smartTvs.ligado);

        smartTvs.aumentarCanal();

        System.out.println ("canal atual : " + smartTvs.canal);

        smartTvs.mudarDeCanal(22);

        System.out.println ("canal atual : " + smartTvs.canal);
  

        smartTvs.aumentarVolume();
        smartTvs.aumentarVolume();
        smartTvs.aumentarVolume();
        smartTvs.diminuindoVolume();
        smartTvs.aumentarVolume();

        System.out.println("volume autal" + smartTvs.volume);



    }


    
}