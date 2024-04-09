package esercitazioni2;

import java.util.ArrayList;
import java.util.Collections;

public class EsercizioCollection_01 
{

	public static void main(String[] args) 
	{
		//crea un ArrayList di nomi comuni di persona (circa 10). Ordina alfabeticamente l'array
		//stampa tutti i nome in console con l'accanto l'indice.
		//stampa il numero di elementi presenti nell'ArrayList
		//rimuovi tutti gli elementi dell'arrayList (cerca il metodo opportuno)
		//controlla se l'ArrayList è vuoto (cerca il metodo opportuno)
		//ATT: questi metodi fanno parte della classe ArrayList.
		
		
		ArrayList <String> nomes = new ArrayList <String> ();
		
		nomes.add("Frida");						//0 a 10 sono 11 elmenti!!
		nomes.add("Leonora");
		nomes.add("Tarsilia");
		nomes.add("Angela");
		nomes.add("Bell");
		nomes.add("Mikasa");
		nomes.add("Nina");
		nomes.add("Amy");
		nomes.add("Elza");
		nomes.add("Samanta");
		nomes.add("Amanda");
		
		
		//nomi con l'accanto l'indice
		for( int i=0; i<nomes.size();i++)
		{
			System.out.println(nomes.get(i) +" "+ i);
		}
		
		//numero presenti nell'ArrayList
		
		System.out.println("L'array è composto da "+ nomes.size() + " elementi");
		
		
		//rimozione di TUTTI gli elementi dell'arrayList  ----> metodo opportuno .removeAll()
		nomes.removeAll(nomes);
		
		System.out.println(nomes);
	
		//controllo se l'ArrayList è vuoto
		
		if(nomes.isEmpty())
		{
			System.out.println("L'array è vuoto!");
		}
		else
		{
			System.out.println("L'arraylist di nomi è: " +nomes);
		}
		
	
		
		

	}

}
