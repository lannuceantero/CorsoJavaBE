package esercitazioni;

import java.util.Scanner;

public class Esercizio08 
{

	public static void main(String[] args) 
	{
		// Scrivi un programma che riceve in input 5 numeri e ne calcola la somma e la media.


		Scanner read = new Scanner (System.in);
		int cinqueNumeri = 5;
		int numInserito;
		int somma =0;
		int media =0 ;
		
		System.out.println("Ciao. Inserisci 5 numeri e otterrai al somma e la media");
		
		
		for(int i =1; i<=cinqueNumeri; i++)
		{
			System.out.println("Inserisci n."+i);
			numInserito = read.nextInt();
			somma = somma +numInserito;
			media = somma /cinqueNumeri;
			
		}
		

		
		System.out.println("La somma è: " +somma);
		System.out.println("La media è: " +media);
		
		
	}

}
