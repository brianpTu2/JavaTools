import java.util.Scanner;

/*
 * GOALS:
 *	- I want to set up your basic template
 *	- I want to set you up so you can take inputs of string and numbers
 *	- I want to get you out of the main.
 */
public class Assignment1_BT_Demo {
	
	public static void game() {
		
		//Variables - game method. They only exist in the game.
		Scanner wordsIn = new Scanner(System.in);
		Scanner numsIn = new Scanner(System.in);
		
		String input = "";
		int nInput = 0;
		//parallel arrays are two arrays that are paired 
		String[] inv = {"Map","Letter","Shoes"};
		int[] invc = new int[3];
		
		System.out.println("Suddenly you hear a large explosion and everything goes black");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println("You wake up and the bridge is chaos");
		
		System.out.println("You roll over and see a large flashing button. Do you press it? (YES/NO)");
		//Problem: If the user types in anything other than yes the program continues 
		//When taking inputs conditional loops are perfect. Conditional loops are used when we don't know how many times something should run.
		//1. While loop: This is an if statement but we switch the word 'if' with 'while'. IT MIGHT SKIP IT.
		//2. do while loop: This is like a while loop. IT WILL ALWAYS RUN ONCE.
		
		do {
			System.out.print("Input: ");
			input = wordsIn.nextLine();
			
		//We want to analyze what the use inputs.
		//Trick: With strings you can check more combination if you convert the string to upper or lower case.
		
			input = input.toUpperCase();
		} while (input.equals("YES") == false && input.equals("NO") == false);
		
		if (input.equals("YES")) {
			
			System.out.println("It turns out that it was a self destruct button and your");
			System.out.println("life flashed before your eyes in the 10 seconds you have");
			System.out.println("until the ship blows up.");
			System.out.println("GAME OVER");
			
			//IF YOU DIE YOU WANT TO EXIT THE METHOD
			return; //stops the method 
			
		}//end if statement
		
		System.out.println("You remember that that is a self-destruct button and leave it be");
		System.out.println("You look on the ground and see 3 items:");
		System.out.println("1. A map");
		System.out.println("2. A letter");
		System.out.println("3. A pair of shoes");
		
		do {
			System.out.println("Which one do you pick? (1/2/3)");
			nInput = numsIn.nextInt();
			
		} while(nInput != 1 && nInput != 2 && nInput != 3);
		
		if (nInput == 1) {
			System.out.println("You chose a map");
			//set your inventory
		}
		
		
		
	} //end game

	public static void main(String[] args) {
		
		//Variables - game method. They only exist in the game.
		//Every method that takes inputs needs to have scanner objects.
		Scanner wordsIn = new Scanner(System.in);
		Scanner numsIn = new Scanner(System.in);
		
		String input = "";
				
		

		System.out.println("Start Main");
		
		//Loop games:
		//To loops the game we will use a conditional loop called a do while loop
		// do while loops are perfect for situations where we must run the loop once.
		
		do {
			
			game();
			
			System.out.println("Play again? (YES/NO)");
			System.out.println("Input: ");
			input = wordsIn.nextLine(); //Take a line of text.
			
			
		} while (input.equalsIgnoreCase("YES"));
		
		System.out.println("End Main");
	

	} //end main

} //end class
