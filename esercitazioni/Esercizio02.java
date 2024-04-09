package esercitazioni;

import java.util.Scanner;

public class Esercizio02 
{

	public static void main(String[] args) 
	{
//		ES.2
//		Scrivi un programma che inserito un numero intero restituisca in uscita da quante cifre è formato.

		
		Scanner read = new Scanner(System.in);
		
		int numInserito;
		
		int contaCifre = 0;
		
		//chiedo all'utente di inserire un numero
		System.out.println("Ciao, inserisci un numero");
		//quello che inserisce lo catturo
		numInserito = read.nextInt();
		
		//CONVERTO l'int in Stringa                
		String numInseritoConv = String.valueOf(numInserito);    //NB: per conversione ho cercato su internet.
		
		//faccio un ciclo in cui vado a contare la lungezza del numero (che ora è una stringa)
		for(int i=0; i<numInseritoConv.length() ; i++)
		{
			//per ogni "numero" vado a contare un carattere
			contaCifre++;
			
		}
		
		System.out.println("Il numero inserito è formato da " +contaCifre + " cifre" );
		
		

	}

}
