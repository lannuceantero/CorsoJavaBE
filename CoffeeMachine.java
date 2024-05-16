package b_SpedizioniUnieuro;

public class CoffeeMachine extends Prodotto
{

	private double costoSpedCoffeMach= 15.0; //costo di spedizione per le macchine caffe 

	@Override
	public double calcolaSpedizione() 
	{
		return super.getPrezzo() + this.costoSpedCoffeMach;
	}

	
	
}
