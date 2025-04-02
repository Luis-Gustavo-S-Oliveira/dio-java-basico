public class rodarAplicativo {
    public static void main(String[] args) {
      
        carros carro1 = new carros("null", "oi", 1);

        carro1.setcor("azul");
        carro1.setmodelo("Ninja1");
        carro1.capacidadeTanque(40);

        System.out.println(carro1.getmodelo());
        System.out.println(carro1.getcor());
        System.out.println(carro1.capacidadeTanque);
        System.out.println(carro1.totalValorTanque(6));

        carros carro2 = new carros("Branco", "Ninja2", 50);

        System.out.println(carro2.getmodelo());
        System.out.println(carro2.getcor());
        System.out.println(carro2.capacidadeTanque);
        System.out.println(carro2.totalValorTanque(6));

        





    }
}
