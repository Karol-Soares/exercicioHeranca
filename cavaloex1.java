package herancaex;

public class cavaloex1 extends Animal_exercicioHeranca
{
	private boolean correr;
	
	public cavaloex1 (String nome, String som, int idade, boolean correr)
	{
		super (nome, som, idade);
		this.correr = correr;
			
	}
	
	public boolean isCorrer()
	{
		return correr;
	}
	
	public void setCorrer(boolean correr)
	{
		this.correr = correr;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n--Dados do cavalo--\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom());
	}
	
	public void imprimirMovimento ()
	{
		if(isCorrer()==true)
		{
			System.out.println("\nPrefere correr");
		}
	}
}
