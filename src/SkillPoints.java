import java.util.Scanner;

public class SkillPoints {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		String name = "";
		int attack = 0;
		int agility = 0;
		int endurance = 0;
		int defense = 0;
		int health = 0;
		int left = 0;
		
		//Story first
		
		System.out.print("Hello fellow gladiator! What is your name? ");
		name = read.next();
		System.out.println("Welcome, " + name + "!");
		System.out.println("You have 100 skill points to put into certain aspects of your character.");
		System.out.print("The possible characteristics are: ");		
		System.out.println("Attack, Agility, Endurance, Defense, and Health.");
		
		do {	 
			
			do {
				//Attack
				System.out.print("How many points do you want in attack? ");
				attack = read.nextInt();
				left = 100 - attack;
			} while (attack <= 0 && attack >= 100);
		
			System.out.println("You have " + left + " skill points left");
			
			do {
				//Agility
				System.out.print("How many points do you want in agility? ");
				agility = read.nextInt();
				left = left - agility;
			} while (left <= 0 && left >= 100);
			
			System.out.println("You have " + left + " skill points left");
			
			do {
				//Endurance
				System.out.print("How many points do you want in endurance? ");
				endurance = read.nextInt();
				left = left - endurance;
			} while (left <= 0 && left >= 100);
			
			System.out.print("You have " + left + " skill points left");
			
			do {
				//Defense
				System.out.println("How many points do you want in defense? ");
				defense = read.nextInt();
				left = left - defense;
			} while (left <= 0 && left >= 100);
			
			System.out.print("You have " + left + " skill points left");
			
			do {
				//Health
				System.out.print("How many points do you want in health? ");
				health = read.nextInt();
				left = left - health;
			} while (left <= 0 && left >= 100);
			
		} while (left != 0);
		
		//HOW TO START OVER IF LEFT IS OVER LIMIT. 
			

		
		
		
		
		
		
		
		
	} //end main

} //end class
