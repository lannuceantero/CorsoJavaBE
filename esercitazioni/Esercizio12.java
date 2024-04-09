package esercitazioni;

import java.util.Scanner;

public class Esercizio12 
{

	public static void main(String[] args) 
	{
//		Scrivi un programma che riceve tre numeri e stampa “crescente” se i numeri sono stati forniti in ordine
//		crescente; “decrescente” se forniti in ordine decrescente; altrimenti stamperà “nessun ordine”.

		
		Scanner read = new Scanner(System.in);
		
		int treNumeri =3 ;
		int  numA;
		int  numB;
		int  numC;
	

		
		
		System.out.println("Inserisci 3 numeri e dirò se sono in ordine crescente, descrente o senza ordine specifico");
		

			System.out.println("Inserisci n.1");
			numA = read.nextInt();
			System.out.println("Inserisci n.2");
			numB = read.nextInt();
			System.out.println("Inserisci n.3");
			numC = read.nextInt();


		if((numC > numB && numC > numA) && (numA < numB && numA < numC))
		{
			System.out.println("Numeri in ordine crescente");
		}
		else if(( numA > numB && numA > numC) && (numB > numC && numB < numA))
		{
			System.out.println("Numeri in ordine decrescente");
		}
		else
		{
			System.out.println("Nessun ordine");
		}
		
		
		
		
		//ALTERNATIVA con Array ??
		
//		int [] treNumArray = new int[2];
//		
//		System.out.print("Inserisci 3 numeri");


		
		
	}

}
