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
    }
}
