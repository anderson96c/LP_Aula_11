
public class ContaBancaria
{
	//Nome do cliente 
	private String cliente;
	//Numero da conta
	private int num_conta;
	//Saldo atual da conta
	private double saldo;
	
	/**
	 * Método construtor da classe.
	 *
	 * @param	c	Nome do cliente
	 * @param	n	numero da conta
	 * @param	s	saldo da conta
	 */
	public ContaBancaria(String c, int n, double s)
	{
		cliente = c;
		num_conta = n;
		saldo = s;
	}

	/**
	 * Retorna o saldo atual da conta
	 *
	 * @return	saldo atual
	 */
	public double getSaldo()
	{
		return saldo;
	}

	/**
	 * Retorna o nome do cliente
	 *
	 * @return	cliente
	 */
	public String getCliente()
	{
		return cliente;
	}
	
	/**
	 * Retorna o numero da conta
	 *
	 * @return	numero da conta
	 */
	public int getNumConta()
	{
		return num_conta;
	}

	/**
	 * Define o novo saldo como sendo o valor passado
	 *
	 * @param	novo saldo
	 */
	public void setSaldo(Double q)
	{
		saldo = q;
	}

	/**
	 * Retira a quantidade de dinheiro passada no parametro
	 *
	 * @param	q	Quantidade de dinheiro a ser sacada
	 */	
	public void sacar(double q)
	{
		if(q < 0)
		{
			System.out.println("Valor inválido");
		}
	
		else if(q > saldo)
		{
			System.out.println("Saldo insuficiente");
		}
		else
		{
			saldo = saldo - q;
		}
	}
	
	/**
	 * Adiciona a quantidade de dinheiro passada no parametro
	 *
	 * @param	q	Quantidade de dinheiro a ser depositada
	 */
	public void depositar(double q)
	{
		if(q < 0)
		{
			System.out.println("Valor inválido");
		}
		else
		{
			saldo = saldo + q;
		}
	}

	/**
	 * Sobescrita da função na filha ContaPoupanca
	 */
	public void calcularNovoSaldo(double t)
	{}

	public String toString()
	{
		return "Client: " + getCliente() + "\n" + "Nº da conta: " + getNumConta() + "\n" + "Saldo atual: " + getSaldo() + "\n";
	}
}

