package esercitazioni;

import java.util.Scanner;

public class Esercizio04 
{

	public static void main(String[] args) 
	{
//		ES.4
//		Inserire una serie di numeri interi positivi da tastiera ed individuare il massimo e il minimo; la serie deve
//		terminare con il numero 0.
		
		Scanner read = new Scanner(System.in);
		
		int quantitaNumeri;
		
		int maxNum =0;
		int minNum =0;
		
		int numInserito;
		
		do
		{
		System.out.println("Quanti numeri vuoi inserire? ");
		quantitaNumeri = read.nextInt();
		
		for(int i=1; i<=quantitaNumeri; i++)
		{
			System.out.println("Inserisci numero "+ i); 
			numInserito = read.nextInt();
			if(numInserito > maxNum)
				maxNum=numInserito;
				
			else if(numInserito < maxNum && numInserito > 0 )  			 
				minNum=numInserito;
			else
			{
				System.out.println("I numeri coincidono");
			}
						
		}
		
		
		
		System.out.println("Il numero maggiore è: "+maxNum);
		System.out.println("Il numero minore è: " +minNum);
		
		
		
	
		
		
		} //chiusura do-while
		while(read.nextInt()!=0);   //oppure while(quantitaNumeri!=0);
		
		

	} //chiusura main

} //chiusura classe
