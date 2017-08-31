
/**
* PessoaJuridica
* 
* Herda atributos e métodos da classe Cliente
* adiciona os atributos cnpj e nome fantasia e métodos para 
* acesso e modificação desses atributos
*
* @author Anderson Caio da Fonseca Santos
*/
public class PessoaJuridica extends Cliente
{
	private String cnpj;
	private String nomeFantasia;

	/**
	 *Método construtor da classe.
	 *
	 *@param	String		CNPJ da pessoa juridica
	 *@param 	String		Nome fantasia da empresa
	 */
	public PessoaJuridica(String n, String e, String t, String cnpj_, String nf)
	{
		super(n, e, t);
		cnpj = cnpj_;
		nomeFantasia = nf;
	}

	/**
	 *Recupera o cnpj da pessoa juridica
	 *
	 *@return	String		cnpj
	 */
	public String getCnpj()
	{
		return cnpj;
	}
	
	/**
	 *Recupera o nome fantasia da pessoa juridica
	 *
	 *@return	String		nome fantasia
	 */
	public String getNomeFantasia()
	{
		return nomeFantasia;
	}
	
	/**
	 *Substitui o nome fantasia pelo parametro passado
	 *
	 *@param	String		novo nome fantasia
	 */
	public void setNomeFantasia(String nf)
	{
		nomeFantasia = nf;
	}

	/**
	 *Imprime todos os dados da pessoa física
	 */
	public void imprimirDados()
	{
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("CNPJ: " + cnpj);
		System.out.println("Empresa: " + nomeFantasia);
	}

}
