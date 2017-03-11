import java.util.Scanner;

public class calculatorVersion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, option;
		double result;
		String con = "y";
		
		
		Scanner scan = new Scanner (System.in);
		
		// 1 for subtract, 2 for add, 3 for time, 4 for divide
		System.out.println("Please select your calculating method" + "\n" + "\t"
		+ "1 for Subtraction" + "\t" + "2 for Addition" + "\t" + "3 for Multiplication" 
		+ "4 for Division");
		
		
		
		// Create a loop until users want to stop using this calculation
		while (con.equalsIgnoreCase("y")) {
			
			// Asking for inputs
			System.out.println("Enter first number: ");
			num1 = scan.nextInt();
			
			System.out.println("Enter second number: ");
			num2 = scan.nextInt();
			
			// Select methods for calculation
			System.out.println("Select your method: ");
			option = scan.nextInt();
			
			// Calculation based on selected option
			switch (option) {
			case 1:
				result = num1 + num2;
				System.out.println("Answer: " + result);
				break;
			case 2: 
				result = num1 - num2;
				System.out.println("Answer: " + result );
				break;
			case 3: 
				result = num1 * num2;
				System.out.println("Answer: " + result );
				break;
			case 4: 
				if (num2 != 0) {
					result = (double) num1 / num2;
					System.out.println("Answer: " + result );
					break;

				} else {
					System.out.println("A number can not be divided by O" );
					break;
				}
			
			// In case user select a different number than 1, 2, 3, 4 as a calculating method
			default: 
				System.out.println("Allow only 1, 2, 3, 4 as calculating methods!");

			}
			
			System.out.println("Do you want another calculation (y/n)? ");
			con = scan.next();
			
			
		}

	}

}
