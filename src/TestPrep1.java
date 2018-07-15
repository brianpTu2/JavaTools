import java.util.Scanner;

/**
 * 
 * @author brian.tu
 *
 */
public class TestPrep1 {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Declares and initializes integer n to 0
		/*
		 * It is always best to declare and initialize your variables at the top of a method.
		 * What is the difference between an integer and a double?
		 * 
		 * A: An integer stores only integers. It can store 2 0r 3 but not 3.4 or 2.0.
		 */
		
		int n = 0;
		System.out.print("Please input how many values in array: ");
		n = s.nextInt();
		
		double[] arr = new double[n]; // create my array of length n
		
		// What structure would I use to tale an input for every element of the array
		// A: a counted loop, which is a for loop
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Input real number: ");
			/*
			 * A do while is called a conditional loop. It runs as long as a condition is true. 
			 * It will alwasy run once. 
			 */
			do {
				arr[i] = s.nextDouble();
				
				if (arr[i] < 0 || arr[i] > 100) {
					System.out.println("ERROR - BAD VALUE");
				}
				
			} while (arr[i] < 0 || arr[i] > 100);
			
		}
		
		
		System.out.println("End program");
		
	} //end main

} //end class
