public class SmartTvs {
    boolean ligado=false;
    int canal=1;
    int volume=25;

    public void ligar (){
        ligado=true;
    }
    public void desligar (){
        ligado=false;
    }

    public void aumentarCanal (){
        canal++; 
    }
    public void diminuirCanal (){
        canal--;
    }

    public void mudarDeCanal( int novoCanal){
        canal=novoCanal;
         

    }

    public void aumentarVolume (){
        volume++;
        System.out.println("aumentendo o volume para " + volume);
    }
    public void diminuindoVolume (){
        volume--;
        System.out.println("diminuindo o volume para " + volume);
    }

   
    
}
