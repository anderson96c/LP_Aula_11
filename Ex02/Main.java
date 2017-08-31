
public class Main
{
	public static void main(String [] args)
	{
		Banco b = new Banco();
		ContaBancaria conta1 = new ContaBancaria("Steve Rogers", 2441, 15478.35);
		ContaBancaria conta2 = new ContaEspecial("Tony Stark", 1475, 30000.00, 20000.00);
		ContaBancaria conta3 = new ContaPoupanca("Peter Parker", 1657, 432.00, 7);

		b.addConta(conta1);
		b.addConta(conta2);
		b.addConta(conta3);

		b.printContas();
		
		System.out.println("Sacando 45000.00 da conta do cliente " + conta2.getCliente() + "\n");
		conta2.sacar(45000.00);
		System.out.println("Calculando novo saldo do cliente " + conta3.getCliente() + " com a taxa de 7%\n\n");
		conta3.calcularNovoSaldo(0.07);

		b.printContas();
	}
}
