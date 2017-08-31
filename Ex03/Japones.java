
import java.util.Random;
public class Japones extends Castelo
{
	//Numero de samurais no castelo
	protected int numSamurais;
	
	
	
	/**
	 * Método construtor da classe
	 *
	 * @param	d	defesa do castelo
	 * @param	l	localização do castelo
	 * @param 	pv	pontos de vida do castelo
	 * @param	n	nome do castelo
	 * @param 	ns	numero de samurais
	 */
	public Japones(double d, double l, double pv, String n, int ns)
	{
		super(d, l, pv, n);
		numSamurais = ns;
	}

	/**
	 * Simula um ataque sofrido pelo castelo
	 * 
	 * @param	d	dano causado no castelo
	 */
	public void ataque(double d)
	{
		Random rd = new Random();
		if(numSamurais > 0)
		{
			numSamurais = numSamurais - (2 + rd.nextInt(4));
		}

		else
		{
			ataque(d);
		}
	}
}
