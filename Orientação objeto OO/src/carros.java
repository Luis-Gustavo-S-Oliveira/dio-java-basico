public class carros {

int capacidadeTanque;

void capacidadeTanque(int capacidadeTanque){
    this.capacidadeTanque = capacidadeTanque;
}

double totalValorTanque (double valorCombustivel){
    
    return  capacidadeTanque * valorCombustivel;
}

}