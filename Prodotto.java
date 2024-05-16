package b_SpedizioniUnieuro;

public abstract class Prodotto
{

	private long id;
	private String nome;
	private String descrizione;
	private double prezzo;
	
	//costruttore vuoto
	public Prodotto() {}
	
	//metodi astratti
	public abstract double calcolaSpedizione();
	
	//non creare il costruttore a firma piena, quindi utilizza solo il costruttore di default(vuoto)
	
	//il metodo per descrivere il prodotto dovrà essere creato qui con il metodo toString

	@Override
	public String toString() 
	{
		return "Prodotto \nid: " + id + " - nome: " + nome + " - descrizione: " + descrizione + " - prezzo (compreso di spedizione): " + calcolaSpedizione() ;
	}

	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getDescrizione()
	{
		return descrizione;
	}

	public void setDescrizione(String descrizione)
	{
		this.descrizione = descrizione;
	}

	public double getPrezzo() 
	{
		return prezzo;
	}

	public void setPrezzo(double prezzo) 
	{
		this.prezzo = prezzo;
	}

	
	
	
	

}
