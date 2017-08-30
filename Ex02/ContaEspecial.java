
public class ContaEspecial extends ContaBancaria
{
	//Limite de saldo negativo
	private double limite;
	
	/**
	 * Método construtor da classe.
	 *
	 * @param	c	Nome do cliente
	 * @param	n	numero da conta
	 * @param	s	saldo da conta
	 * @param	l	limite da conta especial
	 */
	public ContaEspecial(String c, int n, double s, double l)
	{
		super(c, n, s);
		limite = l;
	}

	/**
	 * Pode sacar mais que o saldo atual até atingir o limite
	 * 
	 * @param	q	quantidade a ser sacada
	 */	
	public void sacar(double q)
	{
		if (getSaldo()-1 <(-limite))
		{
			System.out.println("Você atigiu o limite da conta especial");
		}
		
		else if(q < 0)
		{
			System.out.println("Valor inválido");
		}

		else
		{
			setSaldo(getSaldo() - q);
		}
	}

	public String toString()
	{
		return ("Client: " + getCliente() + "\n" + "Nº da conta: " + getNumConta() + "\n" + "Saldo atual: " + getSaldo() + "\n" + "Limite " + limite + "\n");
		
	}
}
