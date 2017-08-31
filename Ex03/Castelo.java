
public class Castelo
{
	//Defesa do castelo
	protected double defesas;
	//Localização do castelo
	protected double localizacao;
	//Pontos de vida do castelo
	protected double ptsVida;
	//Nome do castelo
	protected String nome;

	/**
	 * Método construtor da classe
	 *
	 * @param	d	defesa do castelo
	 * @param	l	localização do castelo
	 * @param 	pv	pontos de vida do castelo
	 * @param	n	nome do castelo
	 */
	public Castelo(double d, double l, double pv, String n)
	{
		defesas = d;
		localizacao = l;
		ptsVida = pv;
		nome = n;
	}

	/**
	 * Imprime os status do castelo
	 *
	 */
	public void mostrarSituacao()
	{
		System.out.println("Castelo: " + nome);
		System.out.println("Defesas: " + defesas);
		System.out.println("Localização: " + localizacao);

		//Caso o castelo não tenha mais pontos de vida
		if(ptsVida <= 0)
		{
			System.out.println("Destruido");
		}
		else
		{
			System.out.println("Pontos de vida: " + ptsVida);
		}
	}

	/**
	 * Simula um ataque sofrido pelo castelo
	 * 
	 * @param	d	dano causado no castelo
	 */
	public void ataque(double d)
	{
		if(defesas > 0)
		{
			defesas = defesas - d;
		}
		else
		{
			ptsVida = ptsVida - d;
		}
	}
}
