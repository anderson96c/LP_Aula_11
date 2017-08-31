/**
* Empresa
* 
* Define um objeto Empresa que armazena objetos do tipo Cliente
* 
* @author Anderson Caio da Fonseca Santos
*/
import java.util.ArrayList;
public class Empresa
{
	private ArrayList<Cliente> empresa;
	
	public Empresa()
	{
		empresa = new ArrayList<Cliente>();
	}
	
	/**
	 * Adiciona um Cliente à empresa
	 *
	 * @param	c	Cliente a ser adicionado
	 */
	public void addCliente(Cliente c)
	{
		empresa.add(c);
	}
	
	/**
	 * Remove um Cliente da empresa
	 *
	 * @param	c	Cliente a ser removido
	 */
	public void removeCliente(Cliente c)
	{
		empresa.remove(c);
	}

	/**
	 * Imprime a quantidade de clientes,
	 * a quantidade de pessoas fisicas e pessoas juridicas
	 */	
	public void countClientes()
	{
		int pj = 0, pf = 0;

		for(int i = 0; i<empresa.size(); i++)
		{
			if(empresa.get(i) instanceof PessoaJuridica)
				pj++;

			//Um cliente qualquer será considerado uma pessoa física
			else
				pf++;
		}

		
		System.out.println("Total de clients cadastrado: " + empresa.size());
		System.out.println("Total de PessoasJuridicas cadastradas: " + pj);
		System.out.println("Total de PessoasFisicas cadastradas: " + pf);
	}
	
	/**
	 * Imprime os dados de cada um dos clientes
	 */	
	public void printClientes()
	{
			for(int i = 0; i<empresa.size(); i++)
		{
			empresa.get(i).imprimirDados();
		}
	}

}
