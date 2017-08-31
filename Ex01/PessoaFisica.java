/**
* PessoaFisica
* 
* Herda atributos e métodos da classe Cliente
* adiciona o atributo cpf e métodos para acesso e modificação
* desse atributo
*
* @author Anderson Caio da Fonseca Santos
*/
public class PessoaFisica extends Cliente
{
	//CPF do Cliente
	private String cpf;
	
	/**
	 *Método construtor da classe.
	 *
	 *@param	String		CPF da pessoa fisica
	 */
	public PessoaFisica(String n, String e, String t,String cpf_)
	{
		super(n, e, t);
		cpf = cpf_;
	}
	
	/**
	 *Recupera o cpf da pessoa fisica
	 *
	 *@return	String		cpf
	 */
	public String getCpf()
	{
		return cpf;
	}

	/**
	 *Imprime todos os dados da pessoa física
	 */
	public void imprimirDados()
	{
		System.out.println();
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("CPF: " + cpf);
		System.out.println();
	}
}
