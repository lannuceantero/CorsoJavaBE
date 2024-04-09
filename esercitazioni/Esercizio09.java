package esercitazioni;

import java.util.Scanner;

public class Esercizio09 
{

	public static void main(String[] args) 
	{
//		Scrivi un programma che stampa un pattern come il seguente triangolo, chiedendo all’utente il numero di righe:
//			1
//			12
//			123
//			1234
//			12345

		Scanner read = new Scanner(System.in);
		int numRigheStampare;
		
		System.out.println("Inserisci n righe da stampare");
		 numRigheStampare = read.nextInt();
		 
		 
		 if (numRigheStampare<0)
		 {
			 System.out.println("Non posso stampare valore negativo");
		 }
		 else if(numRigheStampare==0)
		 {
			 System.out.println("Nessuna riga da stampare");
		 }
		 else //implicito i>0
		 {
			 for(int i=1; i<numRigheStampare; i++)   //per ogni volta che viene stampata una riga, 
			 {										// devo stampare tanti NUMERI quanto è il numero della riga
				 System.out.println(i);
				 for(int j=1; j<=i; j++)
				 {
					 System.out.print(i+j);
				 }
					 
			 }
		 }
		 
		 
 
		 
		 System.out.println();

	}

}
