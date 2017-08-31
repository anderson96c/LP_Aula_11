
public class Personagem
{
	protected int hp;
	protected int força;
	protected int defesa;
	protected int critico;

	Personagem(int hp_, int f, int d, int c)
	{
		hp = hp_;
		força = f;
		defesa = d;
		critico = c;
	}

	/**
	 * Simula um ataque sofrido pelo personagem
	 * 
	 * @param	d	dano do ataque
	 */
	public void receberAtaque(int d)
	{
		hp = hp - (d - defesa);
	}

	
}
