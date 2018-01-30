
import java.util.Scanner;

public class ATMUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		ATM bank = new ATM();
		while(1==1)
		{
			System.out.println("Please input a command");
			System.out.println("R - Reset Bills");
			System.out.println("W + $xxx - Withdrawl specified money");
			System.out.println("Q - Exit");
			System.out.println("I - Print current stock");
			
			
			String command = input.nextLine();
			boolean used = false;
			
			//Reset
			if(command.equalsIgnoreCase("R"))
			{
				bank.R();
				used = true;
			}
			
			//Withdrawl
			if((command.contains("W")||command.contains("w"))
					&&command.contains("$"))
			{
				int money = Integer.parseInt(command.substring(command.indexOf("$")+1));
				bank.W(money);
				used = true;
			}
			
			//Itinerary
			if(command.contains("I") && command.contains("$"))
			{
				bank.I(command.substring(2));
				used = true;
				
			}
			
			//Quit
			if(command.equalsIgnoreCase("Q"))
			{
				System.exit(0);
				
			}
			
			//Invalid
			if(used == false)
			{
				System.out.println("Invalid command");
			}
			
		}
		
		
		
		
	}

}
