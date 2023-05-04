# Gym Vending Machine 
## Synopsis: This software is for a vending machine that takes the points a gym attendee has accumulated by scanning their pass (attending the gym) and allows them to use those points as currency for their desired supplement drink
## This program only needs user input in the form of numbers in order to run the main file and prompt the user. 
## Code Example for inputting user ID and points
```
System.out.println("Enter your ID: ");
		String id = input.nextLine(); 
		
		if(id.length() > 4 || id.length() < 4) {
			System.out.println("Please Enter a Valid ID. ");
			System.exit(0);
			
		}
		
		System.out.println("How many points would you like to use: ");
		int points = input.nextInt();
		
		User user = new User(id, points);
		
		VendingMachine VendingMachine1 = new FreeVendingMachine(user);
		
		System.out.println("Press 1 to confirm login");
		int choice = input.nextInt(); 
```

		
    
    
