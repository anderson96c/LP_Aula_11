
public class ContaPoupanca extends ContaBancaria
{
	//Dia de rendimento
	int dia_de_rendimento;
	
	/**
	 * Método construtor da classe.
	 *
	 * @param	c	Nome do cliente
	 * @param	n	numero da conta
	 * @param	s	saldo da conta
	 * @param 	d	dia de rendimento
	 */
	public ContaPoupanca(String c, int n, double s, int d)
	{
		super(c, n, s);
		dia_de_rendimento = d;
	}
	
	/**
	 * Calcula o novo saldo de acordo com a taxa passada
	 *
	 * @param	t	taxa de rendimento
	 */
	public void calcularNovoSaldo(double t)
	{
		if(t > 1 || t < 0)
		{
			System.out.println("Taxa inválida");
		}

		else
			depositar(getSaldo() * t);
	}

	public String toString()
	{
		return ("Client: " + getCliente() + "\n" + "Nº da conta: " + getNumConta() + "\n" + "Saldo atual: " + getSaldo() + "\n" + "Dia de rendimento: " + 					dia_de_rendimento + "\n");
		
	}
}
