
public class ContaBancaria
{
	private String cliente;
	private int num_conta;
	private double saldo;
	
	/**
	 *Método construtor da classe.
	 *
	 *@param	String		Nome do cliente
	 *@param	int		numero da conta
	 *@param	double		saldo da conta
	 */
	public ContaBancária(String c, int n, double s)
	{
		cliente = c;
		num_conta = n;
		saldo = s;
	}
	
	public void sacar(double q)
	{
		if(q < 0)
		{
			System.out.println("Valor inválido");
		}
		else
		{
			saldo = saldo - q;
		}
	}
}
