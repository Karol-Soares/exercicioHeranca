package herancaex;

public class preguicaex1 extends Animal_exercicioHeranca 
{
	private boolean escalaArvore;
	
	public preguicaex1 (String nome, String som, int idade, boolean escalarArvore)
	{
		super (nome, som, idade);
		this.escalaArvore = escalarArvore;
		
	}
	
	public boolean isEscalarArvore()
	{
		return escalaArvore;
	}
	
	public void setEscalarArvore (boolean escalarArvore)
	{
		this.escalaArvore = escalarArvore;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n--Dados da preguiça--\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom());
	}

	public void imprimirMovimento()
	{
		if (isEscalarArvore()==true)
		{
			System.out.println("\nPrefere escalar árvores");
		}
	}
	
}
