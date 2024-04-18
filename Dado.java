package OOP_model;

public class Dado 
{

//	Costruisci una classe Dado con le seguenti prop e metodi:
//	- numFacce
//	- numRandom
//	- costruttore(numFacce)
//	- lancia(); Il metodo lancia estrae un numero casuale in base al num di facce definito nel costruttore
//
//	Costruisci una classe DadoTester per creare il seguente set di dadi (6 facce, 12 facce, 20 facce)
//
//	Gioco: se la somma dei 3 dadi lanciati contemporanemente è un numero superiore al 26 (+10 punti sul risultato finale) altrimenti (0 punti sul risultato finale).
//	Per ogni dado il cui numero estratto è un multiplo di 2 (+6 punti sul risultato finale) altrimenti (0 punti sul risultato finale). 
//	Calcola i punti totalizza con un singolo lancio di 3 dadi;
	
	
	//PROPRIETA' della classe Dado
	int numFacce;		//ogni dado ha il suo num di facce
	int numRandom;		//il num random che viene estratto quando è lanciato
	
	
	//COSTRUTTORE PIENO con solo int numFacce
	public Dado(int numFacce)
	{
		this.numFacce = numFacce;
	}
	
	//METODO lancia()
	public int lancia()  //Il metodo lancia estrae un numero casuale in base al num di facce definito nel costruttore
	{
	 //definisco un numero casuale utilizzando Math.random
		double casuale =  Math.random() * numFacce; //ricorda che il Math.random è double e PER QUESTO casuale anche deve essere double
													
		numRandom = (int) Math.ceil(casuale);		//definisco che il numRandom (dichiarato nelle proprietà di classe)
//							|						//sia uguale al num casuale che ho creato appena sopra 
//							|						//poiché numRandom è int, devo fare cast del casuale che invece è double
//							|
//							•–>>					Math.ceil serve solo ad arrontondarmi il casuale generato con Math.random().
		return numRandom;
		
		
	}
	
	
	
	
	
}
