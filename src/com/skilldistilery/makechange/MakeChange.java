package com.skilldistilery.makechange;

import java.util.Scanner;

public class MakeChange
{

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		double pennies, nickels, dimes, quaters, dollars;
		String penny, nickel, dime, quater, dollar;
		
		doTransaction(kb);
		
		kb.close();
	}
	
	
	public static void doTransaction(Scanner input)
	{
		//method for transaction
		double price, cash,change;
		System.out.println("Hello there, how much is the price of the widget you are purchasing? ");
		price = input.nextDouble();
		
		System.out.println("Great, how much money are you giving me? ");
		cash = input.nextDouble();
		System.out.println("Thank you.");
		
		if (cash < price)
		{
			System.out.println("Sorry that is not enough money for the widget.");
		}
		if (cash > price) {
			System.out.println("Thanks for your purchase here is your change");
			//makechange
		}
		else if (cash == price) {
			System.out.println("Thanks Have a nice day!");
//			break;
		}
	}
}
