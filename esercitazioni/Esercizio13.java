package esercitazioni;

import java.util.Random;

public class Esercizio13 
{

	public static void main(String[] args)
	{
//		Scrivere un programma per trovare il valore più vicino a 100 tra una coppia di numeri forniti, se
//		sono uguali ritorna un avviso.

		Random r = new Random();   
		
		int a = r.nextInt(1,101); //voglio numero casuale DA 1 a 100.  //RICORDA che l'ultimo non conta!
		int b = r.nextInt(1,101);
		
		
		//ALTERNATIVA  Math.random()  //però con double e arrotonda... non consigliato?
//		int aa = (int) Math.random();
//		int bb = (int) Math.random();
		

		System.out.println("Numero casuale A: "+a);
		System.out.println("Numero casuale B: "+b);
		
		if(a==b)
		{
			System.out.println("I numeri sono uguali");
		}
		else if(b>a)
		{
			System.out.println("Il valore di B, " +b+ " è più vicino a 100");
		}
		else if(a>b)
		{
			System.out.println("Il valore di A, " +a+ " è più vicino a 100");
		}
		else
		{
			System.out.println("error");
		}
		


	}

}
