package esercitazioni;

import java.util.Scanner;

public class Esercizio05 
{

	public static void main(String[] args) 
	{
//		Scrivere un programma che inseriti i lati di un ipotetico triangolo, dica se tale triangolo esiste oppure no.
//		(Un triangolo esiste se ogni lato è minore della somma degli altri due)
		
		Scanner read = new Scanner(System.in);
		int sideA;
		int sideB;
		int sideC;
		
		
		System.out.println("Proviamo a creare un triangolo. Inserisci i 3 lati.\nLato A:");
		sideA = read.nextInt();
		System.out.println("Lato B:");
		sideB = read.nextInt();
		System.out.println("Lato C:");
		sideC = read.nextInt();
		
		//Teorema: In ogni triangolo un lato è minore della somma degli altri due e maggiore della loro differenza.
		if(sideA < sideB+sideC && sideB< sideA+sideC && sideC < sideA+sideB)
		{
			System.out.println("È un triangolo");
		}
		else
		{
			System.out.println("NON è un triangolo");
		}


	}

}
