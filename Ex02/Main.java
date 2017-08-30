
public class Main
{
	public static void main(String [] args)
	{
		Banco b = new Banco();
		ContaBancaria conta1 = new ContaBancaria("Steve Rogers", 2441, 35475.35);
		ContaEspecial conta2 = new ContaEspecial("Tony Stark", 1475, 999999.99, 20000.00);
		ContaPoupanca conta3 = new ContaPoupanca("Peter Parker", 1657, 432.00, 7);

		
		b.addConta(conta1);
		b.addConta(conta2);
		b.addConta(conta3);

		b.printContas();
	}
}
