import java.util.Scanner;

public class Driver {
	private static Scanner sc = new Scanner(System.in);
    private static int userInput2, userInput3;
    
	public static void main(String[] args) {
		// Print out the welcome message and load the menu getInput()
		System.out.println(
				"Welcome to the Recursive Zoo\r\n" + 
				"Author: Steven Douglass");		
		getInput();

	}

	// Print the options available for the user to select
	private static void selectOption() {
		System.out.println(
				"\r\nSelect an Option:\r\n" + 
				"1. Factorial\r\n" + 
				"2. Fibonacci\r\n" + 
				"3. Greatest Common Denominator\r\n" + 
				"4. Combinatorial\r\n" + 
				"5. Josephus\r\n" + 
				"6. Quit\r\n" + 
				"");
	}
	
	// Obtain the user's choice of input
	public static void getInput() {
		selectOption();
		sc = new Scanner(System.in);
	    userInput2 = sc.nextInt();
	    
	    switch (userInput2) {
	    	case 1: System.out.print("Enter the number for the factorial function: ");
	    			sc = new Scanner(System.in);
				    userInput2 = sc.nextInt();
				    System.out.println("The factorial of " + userInput2 + " is " + factorial(userInput2));
				    getInput();
		    		break;
	    	case 2: System.out.print("Enter the Fibonacci position: ");
					sc = new Scanner(System.in);
				    userInput2 = sc.nextInt();
				    System.out.println("The fibonacci number at position " + userInput2 + " is " + fib(userInput2));
				    getInput();
		    		break;
	    	case 3: System.out.print("Enter the first number: ");
					sc = new Scanner(System.in);
				    userInput2 = sc.nextInt();
				    System.out.print("Enter the second number: ");
				    sc = new Scanner(System.in);
				    userInput3 = sc.nextInt();
				    System.out.println("The GCD of the numbers " + userInput2 + " and " + userInput3 + " is " + GCD(userInput2, userInput3));
				    getInput();
		    		break;
	    	case 4: System.out.print("Enter n: ");
					sc = new Scanner(System.in);
				    userInput2 = sc.nextInt();
				    System.out.print("Enter r: ");
				    sc = new Scanner(System.in);
				    userInput3 = sc.nextInt();
				    System.out.println(userInput2 + " choose " + userInput3 + " is " + choose(userInput2, userInput3));
				    getInput();
		    		break;
	    	case 5: System.out.print("Enter n: ");
					sc = new Scanner(System.in);
				    userInput2 = sc.nextInt();
				    System.out.print("Enter k: ");
				    sc = new Scanner(System.in);
				    userInput3 = sc.nextInt();
				    System.out.println("The Josephus of " + userInput2 + " and " + userInput3 + " is " + josephus(userInput2, userInput3));
				    getInput();
		    		break;
	    	case 6: System.out.println("Ending program...");
    				System.exit(0);
    				break;
    		default: System.out.println("\nPlease enter number between 1 and 6\n");
	    			getInput();
	    			break;
	    }	
	}
	
	public static int factorial(int x) {
		if (x <= 1) {
			return 1;
		} else {
			return x * factorial(x - 1);
		}
	}
	
	public static int fib(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			return (fib(x-2) + fib(x-1));
		}
	}
	
	public static int GCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return (GCD(b, a%b));
		}
	}
	
	public static int choose(int n, int r) {
		if((r == 0) || (r == n)) {
			return 1;
		} else if (r > n){
			return 0;
		} else {
			return (choose(n-1, r-1) + choose(n-1, r));
		}
	}
	
	public static int josephus(int n, int k) {
		if (n == 1) {
			return 1;
		} else {
			return ((josephus(n-1, k) + k - 1) % n) + 1;
		}
	}
}
