package a_esercitazione;


//crea una classe Calcolatrice con le seguenti prop e relativo costruttore:
// primoNumero: double
// secondoNumero: double

//con i seguenti metodi
// - calcolaSomma(prinoNumero, secondoNumero)
// - calcolaDifferenza(prinoNumero, secondoNumero)
// - calcolaQuoziente(prinoNumero, secondoNumero)
// - calcolaProdotto(prinoNumero, secondoNumero)

//calcola(prinoNumero, secondoNumero, operazione. 
//In questo metodo in base al simbolo dell'operazione passata svolgerà un determinato metodo 
//(es + per la somma, - differenza, * moltiplicazione, /divisione

//Descrivere con un toString() l'oggetto 

public class Calcolatrice 
{
	
	 //PROPRIETA'
	 double primoNumero;
	 double secondoNumero;
	 String operazione;
	 
	 
	 //COSTRUTTORE PIENO
	public Calcolatrice(double primoNumero, double secondoNumero, String operazione) 
	{
		super();
		this.primoNumero = primoNumero;
		this.secondoNumero = secondoNumero;
		this.operazione = operazione;
		
	}
	
	
	public double calcolaSomma(double primoNumero, double secondoNumero) 
	{
		double somma = this.primoNumero + this.secondoNumero;
		
		return somma;
		
	}
	
	
	public double calcolaDifferenza(double primoNumero, double secondoNumero) 
	{
		double differenza = this.primoNumero - this.secondoNumero;
		
		return differenza;
	}
	
	
	public double calcolaQuoziente(double primoNumero, double secondoNumero) 
	{
		double divisione = this.primoNumero / this.secondoNumero;
		
		return divisione;
	}
	
	
	public double calcolaProdotto(double primoNumero, double secondoNumero) 
	{
		double moltiplicazione = this.primoNumero * this.secondoNumero;
		
		return moltiplicazione;
	}
	
	
	public double calcola(double primoNumero, double secondoNumero, String operazione) 
	{
		
		
		if(operazione.equals("+"))
		{
			return calcolaSomma(primoNumero, secondoNumero);
		}
		else if(operazione.equals("-"))
		{
			return calcolaDifferenza(primoNumero, secondoNumero);
		}
		else if(operazione.equals("*"))
		{
			return calcolaProdotto(primoNumero, secondoNumero);
		}
		else if(operazione.equals("/"))
		{
			return calcolaQuoziente(primoNumero, secondoNumero);
			 
		}
		
		
		else //implicito SE NON è NESSUNO DI QUELLI SOPRA, ha sbagliato a inserire il simbolo
		{
			System.out.println("error, operazione non valida");
			return -1;
		}
		
		 
		
		

	}
	

	@Override
	public String toString()
	{
		return "Calcolatrice [primoNumero=" + primoNumero + ", secondoNumero=" + secondoNumero + "]";
	}


	public static void main(String[] args)
	{
		// mi servirà per stampare in console e fare le verifiche
		
		
		
		Calcolatrice c1 = new Calcolatrice(4,2, " ");

		
		System.out.println("Il risultato dell'operazione è: "+ c1.calcola(4.5, 2.5, "+"));
		System.out.println("Il risultato dell'operazione è: " +c1.calcola(4.5, 2.5, "-"));
		System.out.println("Il risultato dell'operazione è: " +c1.calcola(4.5, 2.5, "*"));
		System.out.println("Il risultato dell'operazione è: " +c1.calcola(4.5, 2.5, "/"));
		
		
		

	}




}
