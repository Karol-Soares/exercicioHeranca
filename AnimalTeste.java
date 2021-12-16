package herancaex;

public class AnimalTeste {
	
	public static void main (String[] args)
	{
		
		cachorroex1 cachorro1 = new cachorroex1 ("Scooby","Salsicha kd vc",10,true);
		cavaloex1 cavalo1 = new cavaloex1 ("Pé de Pano","fui tapeado",12,true);
		preguicaex1 preguica1 = new preguicaex1("Flash","HAHAHA",22,true);
		
		cachorro1.imprimirInfo();
		cachorro1.imprimirMovimento();
		
		cavalo1.imprimirInfo();
		cavalo1.imprimirMovimento();
		
		preguica1.imprimirInfo();
		preguica1.imprimirMovimento();
		
	}

}
