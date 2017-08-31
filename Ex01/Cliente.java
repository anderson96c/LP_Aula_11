/**
* Cliente
*
* Define um objeto Cliente com nome, endereço e telefone
* com métodos para acessar e modificar esses atributos
*
* @author Anderson Caio da Fonseca Santos
*/
public class Cliente
{
	//Nome do Cliente
	private String nome;
	//Endereco do Cliente
	private String endereco;
	//Telefone do Cliente
	private String telefone;

	/**
	 *Método construtor da classe.
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
	
	/**
	 * Sobrescrita nas classes filhas
	 */
	public void imprimirDados()
	{}








}
