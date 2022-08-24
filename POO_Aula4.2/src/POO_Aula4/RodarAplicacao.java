package POO_Aula4;


public class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();        //objeto funcionário guardado dentro da variável funcionário

        Funcionario gerente = new Gerente();                // upcast
        Funcionario vendedor = new Vendedor();              // upcast
        Funcionario faxineiro = new Faxineiro();            // upcast

        //Gerente gerente_ = new Funcionario();

        Vendedor vendedor_ = (Vendedor) new Funcionario();  //downcast
    }


}
