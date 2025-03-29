public class Main {
    public static void main(String[] args) {
        System.out.print("exercicio calculadora");

        Calculadora.soma(2, 3);
        Calculadora.subtracao(3, 2);
        Calculadora.multiplicacao(2, 3);
        Calculadora.divisao(4, 2);   
        
        Horarios.horas(7);
        Horarios.horas(13);
        Horarios.horas(11);

        System.out.println("Exercício empréstimo");
        Emprestimo.valorEmprestimo(1000, Emprestimo.quantidadeParcela2());
        Emprestimo.valorEmprestimo(1000, Emprestimo.quantidadeParcela3());
        Emprestimo.valorEmprestimo(1000, 5);


        //sobrecarga
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);


        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = ReturnQuadrilatero.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = ReturnQuadrilatero.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = ReturnQuadrilatero.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);


    }
}
