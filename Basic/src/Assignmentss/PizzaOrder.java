package Assignmentss;

import java.util.Scanner;

public class PizzaOrder 
{
	Pizza p1 = new Pizza("pizza1", 99.99);
	Pizza p2 = new Pizza("pizza2", 89.99);
	Pizza p3 = new Pizza("pizza3", 79.99);
	double totalOrderCost = 0.0;
	void calculateTotalOrderCost() 
	{
		while(true)
		{
			System.out.println("Menu\n--------\n1.Pizza1---"+p1.getPrice()+"\n2.Pizza2---"+p2.getPrice()+"\n3.Pizza3---"+p3.getPrice()+"\n4.Quit");
			System.out.println("Your bill is "+totalOrderCost+"\nEnter Your Choice");
			Scanner sc = new Scanner(System.in);
			int choice,quantity;
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:System.out.println("Enter Quantity");
					quantity = sc.nextInt();
					totalOrderCost += quantity*p1.getPrice();
					break;
				case 2:System.out.println("Enter Quantity");
					quantity = sc.nextInt();
					totalOrderCost += quantity*p2.getPrice();
					break;
				case 3:System.out.println("Enter Quantity");
					quantity = sc.nextInt();
					totalOrderCost += quantity*p3.getPrice();
					break;
				case 4:System.out.println("Thank you for Choosing our Pizzas");
					System.exit(0);
				default:System.out.println("Invalid");
			}
		}
	}
	public static void main(String[] args) 
	{
		PizzaOrder po = new PizzaOrder();
		po.calculateTotalOrderCost();
	}
}
