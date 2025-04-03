public class carros extends veiculos  {

String modelo;
String cor;
int capacidadeTanque;


carros (String cor, String modelo, int capacidadeTanque){
    this.cor = cor;
    this.modelo = modelo;
    this.capacidadeTanque = capacidadeTanque;
}

void setcor (String cor){
    this.cor = cor;

}
void setmodelo (String modelo){
    this.modelo = modelo;

}

String getmodelo (){

return modelo;

}
String getcor (){
    
    
    return cor;
}

void capacidadeTanque(int capacidadeTanque){

    this.capacidadeTanque = capacidadeTanque;
}

double totalValorTanque (double valorCombustivel){
    
    return  capacidadeTanque * valorCombustivel;
}

}