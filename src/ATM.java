


public class ATM {
private int hundreds ;
private int fifties ;
private int twenties ;
private int tens ;
private int fives ;
private int ones;
public ATM(){
	 hundreds = 10;
	 fifties = 10;
	 twenties = 10;
	 tens = 10;
	 fives = 10;
	 ones = 10;
}
	
	public void R()
	{
		 hundreds = 10;
		 fifties = 10;
		 twenties = 10;
		 tens = 10;
		 fives = 10;
		 ones = 10;
	}
	
	public void W(int withdrawl)
	{
		 int xhund = hundreds;
		 int xfif = fifties;
		 int xtwe = twenties;
		 int xten = tens;
		 int xfive = fives;
		 int xones = ones;
		 
		 int initial = withdrawl;
		 
		 
		int tempMon = withdrawl / 100;
		if(hundreds>=tempMon)
		{hundreds = hundreds - tempMon;
		withdrawl = withdrawl - (tempMon * 100);
		}
		else
		{
			withdrawl = withdrawl - (hundreds*100);
			hundreds = 0;
		}
		
		tempMon = withdrawl / 50;
		if(fifties>=tempMon)
		{fifties = fifties - tempMon;
		withdrawl = withdrawl - (tempMon * 50);}
		else
			{
			withdrawl = withdrawl - (fifties*50);
			fifties = 0;}
		
		tempMon = withdrawl / 20;
		if(twenties>=tempMon)
		{twenties = twenties - tempMon;
		withdrawl = withdrawl - (tempMon * 20);}
		else
		{
			withdrawl = withdrawl - (twenties*20);
			twenties = 0;}
		
		tempMon = withdrawl / 10;
		if(tens>=tempMon)
		{tens = tens - tempMon;
		withdrawl = withdrawl - (tempMon * 10);}
		else
		{
			withdrawl = withdrawl - (tens*10);
			tens= 0;}
		
		tempMon = withdrawl / 5;
		if(fives>=tempMon)
		{fives = fives - tempMon;
		withdrawl = withdrawl - (tempMon * 5);}
		else
		{
			withdrawl = withdrawl - (fives*5);
			fives = 0;}
		
		tempMon = withdrawl;
		if(ones>=tempMon)
		{ones = ones - tempMon;}
		else
			{
			System.out.println("Insufficient funds");
			
			hundreds = xhund;
			fifties = xfif;
			twenties = xtwe;
			tens = xten;
			fives = xfive;
			ones = xones;
			
			return;}
		
		
		System.out.println("Success: Dispensed "+initial);
	}
	
	public void I(String denom)
	{
		System.out.println("Machine Balance:");
		String[] request = denom.split(" ");
		
		for(int c = 0; c<request.length; c++)
		{
			request[c].trim();
			
		if (request[c].equals("$100"))
		System.out.println("$100 - " + hundreds);
		
		if(request[c].equals("$50"))
		System.out.println("$50 - " + fifties);
		
		if(request[c].equals("$20"))
		System.out.println("$20 - " + twenties);
		
		if(request[c].equals("$10"))
		System.out.println("$10 - " + tens);
		
		if(request[c].equals("$5"))
		System.out.println("$5 - " + fives);
		
		if(request[c].equals("$1"))
		System.out.println("$1 - " + ones);
		}
		
		
	}
	
	
	
	
	
}
