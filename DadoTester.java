package OOP_tester;

import OOP_model.Dado;

public class DadoTester 
{

	public static void main(String[] args) 
	{
//		   Costruisci una classe DadoTester per creare il seguente set di dadi (6 facce, 12 facce, 20 facce)

//			Gioco: se la somma dei 3 dadi lanciati contemporanemente è un numero superiore al 26 
//		   (+10 punti sul risultato finale) altrimenti (0 punti sul risultato finale).
		
//			Per ogni dado il cui numero estratto è un multiplo di 2 (+6 punti sul risultato finale) altrimenti (0 punti sul risultato finale). 
//			Calcola i punti totalizza con un singolo lancio di 3 dadi;
		
		
			//ricorda costruttore PIENO è così:    public Dado(int numFacce) { this.numFacce = numFacce; }
			Dado dado1 = new Dado(6);
			Dado dado2 = new Dado(12);
			Dado dado3 = new Dado(20);
			
		
			int risultatoFinale =0 ;
			int bonusDado1 =0;
			int bonusDado2 =0;
			int bonusDado3 =0;
			
			
			
			int numRandomDado1 = dado1.lancia();
			int numRandomDado2 = dado2.lancia();
			int numRandomDado3 = dado3.lancia();
			
			//somma dei 3 dadi lanciati contemporanemente
			int sommaDeiTreDadi = numRandomDado1 + numRandomDado2 + numRandomDado3;
			
			//stampa dei 3 dati lanciati contemporaneamente
			System.out.println("Dado 1: " +numRandomDado1 + "\nDado 2: " +numRandomDado2 + "\nDado 3: " + numRandomDado3);
			
			//stampa della loro somma
			System.out.println("Somma dei dati lanciati contemporaneamente: "+sommaDeiTreDadi);
			
			
//			Gioco: se la somma dei 3 dadi lanciati contemporanemente è un numero superiore al 26 
//			(+10 punti sul risultato finale) altrimenti (0 punti sul risultato finale).
			if(sommaDeiTreDadi >26)
			{
				risultatoFinale = sommaDeiTreDadi + 10;
			}
			else 
			{
				risultatoFinale = sommaDeiTreDadi + 0;
			}
			
			
			System.out.println("Risultato finale somma 3 dati + bonus +10 (SE la somma è >26) è: " +risultatoFinale);
			
			
//			Per ogni dado il cui numero estratto è un multiplo di 2 (+6 punti sul risultato finale) altrimenti (0 punti sul risultato finale). 
//			Calcola i punti totalizza con un singolo lancio di 3 dadi;
			
			if(numRandomDado1%2==0 )
			{		
				risultatoFinale = risultatoFinale+ 6;
			}		
			if(numRandomDado2%2==0)
			{
				risultatoFinale = risultatoFinale+ 6;
			}
			if(numRandomDado3%2==0)
			{
				risultatoFinale = risultatoFinale+ 6;
			}			
			
			//ciclo FOR per ogni dado..
			
	
			
			System.out.println("Risultato finale somma 3 dati + bonus +6/dato (SE multiplo di 2) è: " + (risultatoFinale)); 
			

		
		
	}

}
