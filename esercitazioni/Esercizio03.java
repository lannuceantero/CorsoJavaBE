package esercitazioni;

import java.util.Scanner;

public class Esercizio03 
{

	public static void main(String[] args) 
	{
		// ES.3
		//Scrivere un programma che richiesto un numero intero visualizzi tutti i suoi divisori, contandoli.

		Scanner read = new Scanner (System.in);
		
		int inserisciNum;
		
		int contaDivisore =0;   //divisori non devono dare resto
		
		//chiedo un numero all'utente
		System.out.println("Inserisci numero intero");
		//catturo il numero inserit o
		inserisciNum = read.nextInt();
		
		//come fare per visualizzi tutti i suoi divisori, contandoli.   ???
		
		//divisori non devono dare resto
		while(inserisciNum!=0 && inserisciNum<0);
		{
			for(int i=1; i<inserisciNum; i++)
			{	
				i++;
				if(contaDivisore%i==0);
			}		
			contaDivisore++;
		}
		
		System.out.println("I divisori di "+inserisciNum +" sono " +contaDivisore);
		
			
			//esempio: 10 ha come divisori: 1,2,5,10  
		
		
		
		

	}

}
