import java.util.Scanner;
class Program1
{
	public static void main(String[] args)
	{
		
	 double price = 0.0;

	char c ;
		do{	
			
		 Scanner sc = new Scanner(System.in);
     		   		
		
		System.out.println("Press 1 for Burger");
		System.out.println("Press 2 for Pizza");
		System.out.println("Press 3 for Sandwich");
		System.out.println("Press 4 for Beverages");

		 

		int choice = sc.nextInt();

		switch(choice)
		{
			case 1: 
				System.out.println("Press 1 for Veg Burger");
				System.out.println("Press 2 for Non-Veg Burger");
				
				int burgerChoice = sc.nextInt();

				// System.out.println("Enter the Quantity: ");
				
				// int burgerQuantity = sc.nextInt();

					switch(burgerChoice)
					{
						case 1: 
						System.out.println("You have selected Veg Burger ");
					
						System.out.println("Press 1 to select Veg aloo ticki burger - 60 rupees");
						System.out.println("Press 2 to select Veg Mac Maharaja burger - 180 rupees");
						System.out.println("Press 3 to select Veg double aloo ticki burger - 100 rupees");

						int vegburgerVariety  = sc.nextInt();
		
						System.out.println("Enter the quantity: ");

						int vegburgerQuantity = sc.nextInt();

						
						switch(vegburgerVariety)
						{
							case 1: 
							System.out.println("You have selected Veg aloo ticki burger - 60 rupees");
							price = price + 60 * vegburgerQuantity;
							//System.out.println("Total amount is: "+price);
							break;
							case 2: 
							System.out.println("You have selected Veg Mac Maharaja burger - 180 rupees");
							price = price + 180 * vegburgerQuantity;
							//System.out.println("Total amount is: "+price);
							break;
							case 3: 
							System.out.println("You have selected Veg double aloo ticki burger - 100 rupees");
							price = price + 100 * vegburgerQuantity;
							//System.out.println("Total amount is: "+price);
							break;
					
						}
						
						break;
					
						case 2: 
						System.out.println("You have selected Non-Veg Burger ");
					
						System.out.println("Press 1 to select chicken ticki burger - 90 rupees");
						System.out.println("Press 2 to select chicken Mac Maharaja burger - 200 rupees");
						System.out.println("Press 3 to select chicken double aloo ticki burger - 150 rupees");

						int nonVegburgerVariety  = sc.nextInt();
		
						System.out.println("Enter the quantity: ");

						int nonVegburgerQuantity = sc.nextInt();

						switch(nonVegburgerVariety)
						{
							case 1: 
							System.out.println("You have selected  chicken ticki burger - 90 rupees");
							price = price + 90 * nonVegburgerQuantity;
							//System.out.println("Total amount is: "+price);
							break;
							case 2: 
							System.out.println("You have selected chicken Mac Maharaja burger - 200 rupees");
							price = price + 200 * nonVegburgerQuantity;
							//System.out.println("Total amount is: "+price);
							break;
							case 3: 
							System.out.println("You have selected chicken double aloo ticki burger - 150 rupees");
							price = price + 150 * nonVegburgerQuantity;
							//System.out.println("Total amount is: "+price);
							break;
					
						}

				}
					break;
	
			case 2:
						System.out.println("Press 1 for Veg Pizza");
						System.out.println("Press 2 for Non-Veg Pizza");
				
						int pizzaChoice = sc.nextInt();

						// System.out.println("Enter the Quantity: ");
				
						// int burgerQuantity = sc.nextInt();

						switch(pizzaChoice)
						{
							case 1: 
							System.out.println("You have selected Veg Pizza ");
					
							System.out.println("Press 1 to select Chicago Style Pizza - 160 rupees");
							System.out.println("Press 2 to select Italian Pizza pizza - 200 rupees");
							System.out.println("Press 3 to select New York Style Pizza - 500 rupees");

							int pizzaVariety  = sc.nextInt();
		
							System.out.println("Enter the quantity: ");

							int pizzaQuantity = sc.nextInt();
						
					

						
							switch(pizzaVariety)
							{
								case 1: 
								System.out.println("You have selected Chicago Style Pizza - 160 rupees");
								price = price + 60 * pizzaQuantity;
								// System.out.println("Total amount is: "+price);
								break;
								case 2: 
								System.out.println("You have selected Italian Pizza pizza - 200 rupees");
								price = price + 60 * pizzaQuantity;
								// System.out.println("Total amount is: "+price);
								break;
								case 3: 
								System.out.println("You have selected New York Style Pizza - 500 rupees");
								price = price + 60 * pizzaQuantity;
								// System.out.println("Total amount is: "+price);
								break;

							}

							break;

						case 2: 
						System.out.println("You have selected Non-Veg Pizza ");
					
						System.out.println("Press 1 to select Chicken Dominator Pizza - 190 rupees");
						System.out.println("Press 2 to select Non Veg Supreme - 250 rupees");
						System.out.println("Press 3 to select Chicken Golden Delight - 450 rupees");

						int nonVegPizzaVariety  = sc.nextInt();
		
						System.out.println("Enter the quantity: ");

						int nonVegPizzaQuantity = sc.nextInt();

						switch(nonVegPizzaVariety )
						{
							case 1: 
							System.out.println("You have selected Chicken Dominator Pizza - 190 rupees");
							price = price + 90 * nonVegPizzaQuantity;
							//System.out.println("Total amount is: "+price);
							break;
							case 2: 
							System.out.println("You have selected Non Veg Supreme - 250 rupees");
							price = price + 200 * nonVegPizzaQuantity;
							//System.out.println("Total amount is: "+price);
							break;
							case 3: 
							System.out.println("You have selected Chicken Golden Delight - 450 rupees");
							price = price + 150 * nonVegPizzaQuantity;
							//System.out.println("Total amount is: "+price);
							break;
					
						}
					}
	
						break;

			
			case 3:
						System.out.println("Press 1 for Veg Sandwich");
						System.out.println("Press 2 for Non-Veg Sandwich");
				
						int sandwichChoice = sc.nextInt();

						// System.out.println("Enter the Quantity: ");
				
						// int burgerQuantity = sc.nextInt();

						switch(sandwichChoice)
						{
							case 1: 
							System.out.println("You have selected Veg Sandwich ");
					
							System.out.println("Press 1 to select Veg Grilled Sandwich - 60 rupees");
							System.out.println("Press 2 to select Veg Cheese Sandwich - 80 rupees");
							System.out.println("Press 3 to select Veg Club Sandwich - 100 rupees");

							int vegsandwichVariety  = sc.nextInt();
		
							System.out.println("Enter the quantity: ");

							int vegsandwichQuantity = sc.nextInt();
						
					

						
							switch(vegsandwichVariety)
							{
								case 1: 
								System.out.println("You have selected Veg Grilled Sandwich - 60 rupees");
								price = price + 60 * vegsandwichQuantity;
								// System.out.println("Total amount is: "+price);
								break;
								case 2: 
								System.out.println("You have selected Veg Cheese Sandwich - 80 rupees");
								price = price + 80 * vegsandwichQuantity;
								// System.out.println("Total amount is: "+price);
								break;
								case 3: 
								System.out.println("You have selected Veg Club Sandwich - 100 rupees");
								price = price + 100 * vegsandwichQuantity;
								// System.out.println("Total amount is: "+price);
								break;

							}

							break;

						case 2: 
						System.out.println("You have selected Non-Veg Sandwich ");
					
						System.out.println("Press 1 to select Chicken Grilled Sandwich - 90 rupees");
						System.out.println("Press 2 to select Chicken Cheese Sandwich - 120 rupees");
						System.out.println("Press 3 to select Chicken Club Sandwich - 150 rupees");

						int nonVegSandwichVariety  = sc.nextInt();
		
						System.out.println("Enter the quantity: ");

						int nonVegSandwichQuantity = sc.nextInt();

						switch(nonVegSandwichVariety )
						{
							case 1:
							System.out.println("You have selected Chicken Grilled Sandwich - 90 rupees");
							price = price + 90 * nonVegSandwichQuantity;
							//System.out.println("Total amount is: "+price);
							break;
							case 2:
							System.out.println("You have selected Chicken Cheese Sandwich - 120 rupees");
							price = price + 120 * nonVegSandwichQuantity;
							//System.out.println("Total amount is: "+price);
							break;
							case 3:
							System.out.println("You have selected Chicken Club Sandwich - 150 rupees");
							price = price + 150 * nonVegSandwichQuantity;
							//System.out.println("Total amount is: "+price);
							break;
			
						}

						}
					break;

			case 4:
						System.out.println("Press 1 for Soft Drinks");
						System.out.println("Press 2 for Milkshakes");
				
						int beverageChoice = sc.nextInt();

						// System.out.println("Enter the Quantity: ");
				
						// int burgerQuantity = sc.nextInt();

						switch(beverageChoice)
						{
							case 1: 
							System.out.println("You have selected Soft Drinks ");
					
							System.out.println("Press 1 to select Coca-Cola - 30 rupees");
							System.out.println("Press 2 to select Pepsi - 30 rupees");
							System.out.println("Press 3 to select Sprite - 30 rupees");

							int softDrinkVariety  = sc.nextInt();
		
							System.out.println("Enter the quantity: ");

							int softDrinkQuantity = sc.nextInt();
						
					

						
							switch(softDrinkVariety)
							{
								case 1: 
								System.out.println("You have selected Coca-Cola - 30 rupees");
								price = price + 30 * softDrinkQuantity;
								// System.out.println("Total amount is: "+price);
								break;
								case 2: 
								System.out.println("You have selected Pepsi - 30 rupees");
								price = price + 30 * softDrinkQuantity;
								// System.out.println("Total amount is: "+price);
								break;
								case 3: 
								System.out.println("You have selected Sprite - 30 rupees");
								price = price + 30 * softDrinkQuantity;
								// System.out.println("Total amount is: "+price);
								break;

							}

							break;

						case 2: 
						System.out.println("You have selected Milkshakes ");
					
						System.out.println("Press 1 to select Chocolate Milkshake - 80 rupees");
						System.out.println("Press 2 to select Strawberry Milkshake - 80 rupees");
						System.out.println("Press 3 to select Vanilla Milkshake - 80 rupees");

						int milkShakeVariety  = sc.nextInt();
		
						System.out.println("Enter the quantity: ");

						int milkShakeQuantity = sc.nextInt();

						switch(milkShakeVariety )
						{
							case 1:
							System.out.println("You have selected Chocolate Milkshake - 80 rupees");
							price = price + 80 * milkShakeQuantity;
							//System.out.println("Total amount is: "+price);
							break;
							case 2:
							System.out.println("You have selected Strawberry Milkshake - 80 rupees");
							price = price + 80 * milkShakeQuantity;
							//System.out.println("Total amount is: "+price);
							break;
							case 3:
							System.out.println("You have selected Vanilla Milkshake - 80 rupees");
							price = price + 80 * milkShakeQuantity;
							//System.out.println("Total amount is: "+price);
							break;

						}
					}
					break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
				
		}
				System.out.println("Press Y/y to repeat the order: ");
				c = sc.next().charAt(0);
		  

		} while(c=='Y' || c=='y');
	
		System.out.println("Your order has been placed wait at the counter and your total bill is: "+price);
		System.out.println("Thank you for visiting our restaurant! Have a great day!");
		

	}

	
	

}