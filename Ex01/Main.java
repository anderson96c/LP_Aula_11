
import java.util.ArrayList;
public class Main
{
	public static void main(String [] args)
	{
		ArrayList<Cliente> list = new ArrayList<Cliente>();
		PessoaFisica cliente1 = new PessoaFisica("Cliente1", "Rua A, Nº 0", "333-4587", "999.999.999-99");
		PessoaJuridica cliente2 = new PessoaJuridica("Cliente2", "Rua B, Nº 0", "333-6771", "222.222.222-22", "Qualquer nome");
		
		
		
		Cliente c1 = cliente1;
		Cliente c2 = cliente2;
		c1.imprimirDados();
		c2.imprimirDados();
	}
}
