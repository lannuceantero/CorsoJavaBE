package esercitazioni;

import java.util.Scanner;

public class Esercizio07 
{

	public static void main(String[] args) 
	{
//		Scrivi un programma che prenda un intero tra 1 e 7 e mostri il giorno della settimana.

		Scanner read = new Scanner(System.in);
		int giorno = 6;
		
		
		//NB LUNEDì è giorno 1° giorno della settimana in questo codice.
		
		System.out.println("Inserisci numero tra 1 e 7 per sapere quale sia il giorno della settimana corrispondente");
		giorno = read.nextInt();
		if(giorno<7 && giorno>7 && giorno==0)
		{
			System.out.println("Numero inserito non valido");
		}
		else
		
		
		//sintassi swith(condizione) {   case 0: {} break, case 1: {} break, case 2: {} break; default: {}    }
		switch(giorno)
		{ 
		case 1:	
			System.out.println("lunedì");
		break;											//ricorda BREAK per uscire dal codice
		case 2:
			System.out.println("martedì");
		break;
		case 3:
			System.out.println("mercoledì");
		break;
		case 4:
			System.out.println("giovedì");
		break;
		case 5:
			System.out.println("venerdì");
		break;
		case 6:
			System.out.println("sabato");
		break;
		case 7:
			System.out.println("domenica");    
		break;
		
		
		default:		
		System.out.println("Numero non valido");
	
		} //chiusura SWITCH 
		
		
		
	} //chiusura main

}  //chiusura classe
