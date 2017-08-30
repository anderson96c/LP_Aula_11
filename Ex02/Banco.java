
import java.util.*;

public class Banco
{
	private ArrayList<ContaBancaria> bank;

	public Banco()
	{
		bank = new ArrayList<ContaBancaria>();
	}

	public void addConta(ContaBancaria c)
	{
		bank.add(c);
	}

	public void removeConta(ContaBancaria c)
	{
		bank.remove(c);
	}

	public void printContas()
	{
		for(int i = 0; i < bank.size(); i++)
		{
			System.out.println(bank.get(i));
		}
	}

}
