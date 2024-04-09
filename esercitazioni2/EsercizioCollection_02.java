package esercitazioni2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EsercizioCollection_02 
{

	public static void main(String[] args)
	{
		// Gioco del Lotto
		//chiedere all'utente quanti numeri casuali estrarre da un set di 90 numeri
		
		Scanner read = new Scanner (System.in);
		int res;
		int numCasuale;
		
		boolean condizione = true;
		
		//chiedo all'utenten QUANTI numeri casuali vuole estrarre
		System.out.println("Quanti numeri casuali vuoi estrarre da un set di 90 numeri?");
		//catturo la risposta
		res = read.nextInt();
		
		if(res>90)
		{
			System.out.println("Non puoi inserire più di 90 numeri");
		}
		else  //implicito SE l'utente mette da 1-90 ESEGUE il codice:
		{
			Random r = new Random();
			
			ArrayList <Integer> numeriEstratti = new ArrayList <Integer> ();
			
			//ciclo per avere TANTI NUMERI CASUALI quanti l'utente VUOLE
			for(int i = 0; i<res; i++)
			{
			
				numCasuale = r.nextInt(91); //voglio numero casuale DA 1 a 90
				
					if(numeriEstratti.contains(numCasuale))
					{
						i--;          //SE (numeriEstratti.contains(numCasuale) i-- che sta per RIFAI IL GIRO!
					}
		
					else  //implicitamente cioè se numeriEstratti NON continiene numCasuale
					{
						numeriEstratti.add(numCasuale);   //AGGIUNGO numCasuale all'arrayList numeriEstratti
					}
						
				//stampo i numeri casuali.	
				System.out.println(numCasuale);

				
				
				
				
			}
			
			//System.out.println(numeriEstratti);
		}
		
		
		
	

		
		
	

		
		
	

	}

}
