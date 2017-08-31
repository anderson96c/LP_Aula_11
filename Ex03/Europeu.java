
import java.util.Random;
public class Europeu extends Castelo
{
	protected int numPaladinos;
	
	
	/**
	 * Método construtor da classe
	 *
	 * @param	d	defesa do castelo
	 * @param	l	localização do castelo
	 * @param 	pv	pontos de vida do castelo
	 * @param	n	nome do castelo
	 * @param	np 	numero de paladinos
	 */
	public Europeu(double d, double l, double pv, String n, int np)
	{
		super(d, l, pv, n);
		numPaladinos = np;
	}

	/**
	 * Simula um ataque sofrido pelo castelo
	 * 
	 * @param	d	dano causado no castelo
	 */
	public void ataque(double d)
	{
		Random rd = new Random();
	
		if(numPaladinos > 0)
		{
			numPaladinos = numPaladinos - (2 + rd.nextInt(4));
		}
		else
		{
			ataque(d);
		}
	}
}
