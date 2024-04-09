package esercitazioni;

import java.util.Scanner;

public class Esercizio01 
{

	public static void main(String[] args) 
	{
//		ES.1
//		Scrivere un programma che visualizzi sullo schermo del terminale il vostro nome all’interno di un
//		rettangolo, come nell’esempio seguente:
//		+ - - - +
//		| Dario |
//		+ - - - +
		
//		Es.1a
//		Usare metodi lenght(), concat(String) e toUpperCase() su stringhe e verificare il risultato in output.
//		Parole esempio : Java; Script

		Scanner read = new Scanner(System.in);
		String myName = "Lannuce";
		String insertName;
		
		System.out.print("+ ");
		for(int i=0; i<myName.length(); i++) 
		{
				System.out.print("- ");	
		}
		System.out.println("+");
		
		System.out.println("\n|  "+ myName + " 	 |");
		
		System.out.print("+ ");
		for(int i=0; i<myName.length(); i++) 
		{
			System.out.print("- " );
	
		}
		System.out.println("+");
		
		
		System.out.println("\n---------ES 1a----------");
		
		
//		Es.1a
//		Usare metodi lenght(), concat(String) e toUpperCase() su stringhe e verificare il risultato in output.
//		Parole esempio : Java; Script
		
		
		String parola1 = "Java";
		String parola2 = "Script";
		
		String unione = parola1.concat(parola2);
		System.out.println(unione);
		
		String uppCase = unione.toUpperCase();
		System.out.println(uppCase);
//		
//		String taglio = unione.substring(0,5);  //da dove parte, a partire da dove parte
//		
//		System.out.println(taglio);
//		
//		String [] separa = unione.split("aS");
//		for(String pezzo : separa)
//		{
//			System.out.println(pezzo);
//		}
//		
//		String saluto = "Ciao come stai ? Tutto bene grazie ";
//		
//		//split taglia una stringa tutte le volte che incontro un pattern
//		String [] spezzata = saluto.split(" ");
//		
//		for(String pezzo : spezzata)   //lo split trasforma la parola in array
//		{
//			System.out.println(pezzo);
//		}
//		
//		String mioNome = "Dario";
//		String[] nomeArr = mioNome.split("");
//		for( String lettera : nomeArr)
//		{
//			System.out.println(lettera);
//		}
		
		
		
		
	}

}
