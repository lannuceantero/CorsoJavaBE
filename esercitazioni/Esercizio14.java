package esercitazioni;

public class Esercizio14 
{

	public static void main(String[] args) 
	{
//		Scrivi un programma che stampa tutti gli interi da 1 a 100. Per i multipli di 3 stampa “Ciao”,
//		per i multipli di 5 stampa “Mondo”. Per i multipli sia di 3 , sia di 5 stamperà “Ciao, Mondo”

		int centoNumeriInteri = 100;
		for(int i =1; i<=centoNumeriInteri; i++)
		{
		//System.out.println(i);    //finqui tutto ok
			
		
		
		if(i*3==0)
		{
			System.out.println("Ciao");
		}
		
		else if (i*5==0)
		{
			System.out.println("Mondo");
		}
		
		else if(i*3==0 && i*5==0)
		{
			System.out.println("Ciao, Mondo");
		}
		
		else
		{
			System.out.println("Error");
		}
			
			
			
			
		}
	}
	

}
