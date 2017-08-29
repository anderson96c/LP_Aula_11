
public class Cliente
{
	private String nome;
	private String endereco;
	private String telefone;

	/**
	 *Método construtor da classe
	 *
	 *@param	String		Nome do cliente
	 *@param	String		Endereço do cliente
	 *@param	String		Telefone do cliente
	 */
	public Cliente(String n, String e, String t)
	{
		nome = n;
		endereco = e;
		telefone = t;
	}

	/**
	 *Recupera o nome do cliente
	 *
	 *@return	String		Nome do cliente
	 */
	public String getNome()
	{
		return nome;
	}

	/**
	 *Recupera o endereço do cliente
	 *
	 *@return	String		Endereço do cliente
	 */
	public String getEndereco()
	{
		return endereco;
	}

	/**
	 *Recupera o nome do cliente
	 *
	 *@return	String		Telefone do cliente
	 */
	public String getTelefone()
	{
		return telefone;
	}
	
	/**
	 *Substitui o endereço pelo parametro passado
	 *
	 *@param	String		Novo endereço
	 */
	public void setEndereco(String e)
	{
		endereco = e;
	}

	/**
	 *Substitui o telefone pelo parametro passado
	 *
	 *@param	String		Novo telefone
	 */
	public void setTelefone(String t)
	{
		telefone = t;
	}

	public void imprimirDados()
	{}








}
