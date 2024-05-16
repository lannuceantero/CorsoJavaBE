package b_SpedizioniUnieuro;

public class Main 
{


	public static void main(String[] args) 
	{
		//Prodotto (id, nome, descrizione, prezzo)
		
		Computer pc1 = new Computer();
		
		pc1.setId(1);
		pc1.setNome("Acer");
		pc1.setDescrizione("pc fisso da ufficio");
		pc1.setPrezzo(700);
		
		
		System.out.println(pc1.toString());
		
		Computer pc2 = new Computer();
		
		pc2.setId(2);
		pc1.setNome("HP");
		pc2.setDescrizione("portatile domestico");
		pc2.setPrezzo(1000);
		
		System.out.println(pc2.toString());
		
		
		CoffeeMachine cm1 = new CoffeeMachine();
		
		cm1.setId(3);
		cm1.setNome("Nespresso");
		cm1.setDescrizione("a capsule");
		cm1.setPrezzo(100);
		
		System.out.println(cm1.toString());
		
		
		CoffeeMachine cm2 = new CoffeeMachine();
		
		cm2.setId(4);
		cm2.setNome("Lavazza");
		cm2.setDescrizione("a cialde");
		cm2.setPrezzo(80);
		
		
		System.out.println(cm2.toString());
		
		

	}

}
