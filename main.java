import java.util.Scanner;

public class HW3_150120526 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int exit = 1;
		while(exit == 1) {
		System.out.println("Which shape would you like to draw?" +
				 "\n 1. Line" +
				 "\n 2. Parabola" +
				 "\n 3. Circle" +
				 "\n 4. Exit");
		int choosenNumber = input.nextInt();
		
		
		// If user chooses 1 this code will be work
		if(choosenNumber == 1) { 
			
			// Taken number from user for Line values
			System.out.print("\nLine formula is y = ax + b\n" + 
					"Please enter coefficients a and b:");
			int a = input.nextInt();
			int b = input.nextInt();
			
			
			for(int y = 10; y >= -11; y--) {				
				for (int x = -10; x < 11; x++) { 
					
					if(x == 0 && y == 10) 
						System.out.print("y");
					
					else if(y == a * x + b) 
						System.out.print("*"); // makes a circle with given numbers
					
					else if(x == 0) 
						System.out.print("|"); //  makes y-axis
										
					else if(y == -1) 
						System.out.print("-"); //  makes x-axis
										
					else 
						System.out.print(" "); //  makes spaces
										
					if(x == 10 && y == 0) 
						System.out.print("x");
					
					
				}
				System.out.println();
			}
		}

	
		
		// If user chooses 2 this code will be work
		else if(choosenNumber == 2) {
			
			// Taken number from user for Parabola values
			System.out.print("\nParabola formula is y = ax^2 + bx + c\n" + 
					"Please enter coefficients a, b and c:");
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			
			
			for(int y = 10; y >= -11; y--) {
				for (int x = -10; x <= 11; x++) { 
					
					if(x == 0 && y == 10) 
						System.out.print("y");
					
					else if(y == a * Math.pow(x,2) + b * x + c) 
						System.out.print("*"); // makes a circle with given numbers
					
					else if(x == 0) 
						System.out.print("|"); // makes y-axis
										
					else if(y == -1) 
						System.out.print("-"); // makes x-axis
										
					else 
						System.out.print(" "); // makes spaces
									
					if(x == 10 && y == 0) 
						System.out.print("x");
					
				}	
				System.out.println();
			
		
			}
		}
		
		
		
		
		// If user chooses 1 this code will be work
		else if(choosenNumber == 3) {
			
			// Taken number from user for Circle values
			System.out.print("\nCircle formula is (x-a)^2 + (y-b)^2 = r^2\n" + 
					"Please enter center's coordinates (a,b) and radius:");
			int a = input.nextInt();
			int b = input.nextInt();
			int r = input.nextInt();
			
			
			for(int y = 10; y >= -11; y--) {				
				for (int x = -10; x <= 11; x++) { 
					
					if(x == 0 && y == 10) 
						System.out.print("y");
					
					else if(Math.pow(r,2)== Math.pow(x-a,2) + Math.pow(y-b,2)) 
						System.out.print("*"); // makes a circle with given numbers
					
					else if(x == 0) 
						System.out.print("|"); // makes y-axis
										
					else if(y == -1) 
						System.out.print("-"); // makes x-axis
										
					else 
						System.out.print(" "); // makes spaces 
						
					if(x == 10 && y == 0) 
						System.out.print("x");
					
				}
				System.out.println();
			}
			
		}
		// If user chooses 4 this code will be work
		else if(choosenNumber == 4) 
			exit = 0;
		

		}
		
		
	}

}
