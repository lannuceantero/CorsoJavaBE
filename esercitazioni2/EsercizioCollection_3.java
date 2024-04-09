package esercitazioni2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EsercizioCollection_3 
{

	public static void main(String[] args)
	{
		// Gioco del Lotto
		//chiedere all'utente quanti numeri casuali estrarre da un set di 90 numeri
		
		Scanner read = new Scanner (System.in);
		int res;
		int casuale;
		
		boolean condizione = true;

				
		Random r = new Random();
		
		ArrayList <Integer> numeriEstratti = new ArrayList <Integer> ();
		
		ArrayList <Integer> numMano = new ArrayList <Integer> ();
		
		numMano.add(10);
		numMano.add(4);
		numMano.add(88);
		
		//chiedo all'utenten QUANTI numeri casuali vuole estrarre
		System.out.println("Quanti numeri casuali vuoi estrarre da un set di 90 numeri?");
		//catturo la risposta
		res = read.nextInt();
		
		if(numMano.contains(res))
		{
			System.out.println("error");
		}
		else
		{
			System.out.println(numMano);
		}	
		
		
		
//		
//		//ciclo per avere TANTI NUMERI CASUALI quanti l'utente VUOLE
//		for(int i = 0; i<res; i++)
//		{
//		
//			casuale = r.nextInt(91); //voglio numero casuale DA 1 a 90
//			
//
//
//				if(casuale!=casuale)
//				{
//						do 
//						{
//							numeriEstratti.add(casuale);
//						}
//						while(false);
//				}
//					
//				
//			
//
//			
//			System.out.println(casuale);

			
			
			
//			
//		}
//		
//		System.out.println(numeriEstratti);
		
		
	

		
		
	

		
		
	

	}

}
