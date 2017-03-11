
public class calculator {
	

	private int num1, num2;
	private double result;
	
	
	public calculator (int input1, int input2) {
		
		num1 = input1;
		num2 = input2;
		
	}
	
	// 1. Subtraction
	public double subtract() {
		result = num1 - num2;
		return result;
	}
	
	
	// 2. Addition
	public double add() {
		result = num1 + num2;
		return result;
	}
	
	// Multiplication
	public double time() {
		result = num1 + num2;
		return result;
	}
	
	
	// Division
	public double divide() {
		if (num2 != 0) {
			result = num1 / num2;
			
		}
		else 
			System.out.println("Please check your inputs!!");
		return result;
	}
	
	
	
	// toString method
	public String toString() {
		return "Your result is: " + result;
	}
	
}

