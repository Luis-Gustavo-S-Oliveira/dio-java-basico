public class RodarAplicação {
    public static void main(String[] args) {

        

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        System.out.println(gerente.nome);
        System.out.print(gerente.idade + " anos");


    }


}
