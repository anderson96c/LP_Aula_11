/**
* Main
*
* Classe para testes das classes Cliente, PessoaFisica, PessoaJuridica
* e Empresa
*
* @author Anderson Caio da Fonseca Santos
*/
import java.util.ArrayList;
public class Main
{
	public static void main(String [] args)
	{
		//Instanciando uma Empresa
		Empresa emp = new Empresa();
		//Instanciando diferentes Clientes
		PessoaFisica cliente1 = new PessoaFisica("Cliente1", "Rua A, Nº 0", "333-4587", "999.999.999-99");
		PessoaJuridica cliente2 = new PessoaJuridica("Cliente2", "Rua B, Nº 0", "333-6771", "222.222.222-22", "Qualquer nome");
		Cliente cliente3 = new Cliente("Cliente3", "Rua C, Nº 0", "333-9874");
		
		
		//Adicionando clientes a empresa
		emp.addCliente(cliente1);
		emp.addCliente(cliente2);
		emp.addCliente(cliente3);

		//Testando método de contagem
		emp.countClientes();
		//Testando polimorfismo na função imprimirDados()
		emp.printClientes();
	}
}
