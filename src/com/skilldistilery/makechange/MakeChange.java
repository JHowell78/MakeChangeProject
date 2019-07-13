package com.skilldistilery.makechange;

import java.util.Scanner;

public class MakeChange
{

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		doTransaction(kb);

		kb.close();
	}

	public static void doTransaction(Scanner input)
	{
		double price, cash, changetotal;
		System.out.println("Hello there, how much is the price of the widget you are purchasing? ");
		System.out.println("Plenter enter the price of your item in dollars ");
		price = input.nextDouble();

		System.out.println("Great, how much money are you giving me? ");
		cash = input.nextDouble();
		System.out.println("Thank you.");
		changetotal = cash - price;

		if (cash < price)
		{
			System.out.println("Sorry that is not enough money for the widget.");
			doTransaction(input);
		}
		if (cash > price)
		{
			changeMethod(changetotal);
			
		} else if (cash == price)
		{
			System.out.println("Thanks Have a nice day!");
		}
	}
	
	public static void changeMethod(double changetotal)
	{
		int TenDollarBills = 0, FiveDollarBills = 0, DollarBills = 0;
		double Pennies = 0, Nickels = 0, Dimes = 0, Quarters = 0;
		System.out.println("Thanks for your purchase here is your change");
		System.out.print("And your change is:  $ ");
		System.out.printf("%.2f%n", changetotal);
		changetotal = changetotal * 100 + .005; // convert all change into pennies and fixes penny remainder

		TenDollarBills = (int) (changetotal / 1000);
		changetotal = changetotal % 1000;
		if (TenDollarBills > 0)
		{
			System.out.println(TenDollarBills + " ten dollar bill, ");
		}
		FiveDollarBills = (int) (changetotal / 500);
		changetotal = changetotal % 500;
		if (FiveDollarBills > 0)
		{
			System.out.println(FiveDollarBills + " five dollar bill, ");
		}
		DollarBills = (int) (changetotal / 100);
		changetotal = changetotal % 100;
		if (DollarBills > 0)
		{
			System.out.println(DollarBills + " one dollar bills, ");
		}
		Quarters = (int) (changetotal / 25);
		changetotal = changetotal % 25;
		if (Quarters > 0)

		{
			System.out.printf("%.0f", Quarters); // print f %f fixes double decimal points
			System.out.println(" quarters");
		}
		Dimes = (int) (changetotal / 10);
		changetotal = changetotal % 10;
		if (Dimes > 0)
		{
			System.out.printf("%.0f", Dimes);
			System.out.println(" dimes");
		}
		Nickels = (int) (changetotal / 5);
		changetotal = changetotal % 5;
		if (Nickels > 0)
		{
			System.out.printf("%.0f", Nickels);
			System.out.println(" nickels");
		}
		Pennies = (int) (changetotal / 1);
		changetotal = changetotal % 1;
		if (Pennies > 0)
		{
			System.out.printf("%.0f", Pennies);
			System.out.println(" pennies");
		}
	}
}
