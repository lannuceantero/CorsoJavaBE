package b_SpedizioniUnieuro;

public class Computer extends Prodotto
{

	private double costoSpedPC = 20.0; //costo di spedizione per i computer (fissi o portatili)
	
	
	public Computer() 
	{
		super();
		this.costoSpedPC = costoSpedPC;
	}


	@Override
	public double calcolaSpedizione() 
	{
		
		return super.getPrezzo() + this.costoSpedPC;
	}



	
	

}
