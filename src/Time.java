/*
 * THEORY
 * 
 * Classes are blueprints for objects. 
 * 
 * In this case we have created a Time class.  From this we can create Time objects.  We can create many objects 
 * from a single class. 
 * 
 * An object has attributes and behaviours.  Attributes are fields and behaviours are methods. 
 * 
 * 
 */
public class Time {

	//*********************FIELDS***********************
	/*
	 * THEORY:  FIELDS
	 */
	private int hour;
	private int tens;
	private int units;
	
	
	//*********************CONSTRUCTORS*****************
	/*
	 * A constructor is a special method that is ONLY CALLED ONCE when the object is first created. 
	 * 
	 * Time t = new Time(12,0) will create a Time object.  
	 * 
	 * ADVANCED:  We say that the above line has a Time reference and a Time object.  The reference type and object type often match.  However,
	 * 			  they do not have to!!!
	 * 
	 * 			 <Reference Type> <name of variable> = new <Object Type>();
	 * 
	 * 			This becomes very important when dealing with hierarchies. 
	 */
	public Time(int h, int m) {
		
		hour = h; //sets field hours to parameter h. 
		//SKILL: Using integer division we can "chop off" the units digit 
		tens = m/10;  
		//SKILL: Using modulus we can access the units digit
		units = m%10;
		
		//Approach: It is easier here to chop up the time into parts that we can then manage.
	
	}
	
	//**********************METHODS**************************************
	
	//**********************INSTANCE METHODS**************
	
	/**
	 * This method adds one minute to the clock, accounting for any shifts in the 
	 * other times. 
	 * 
	 */
	public void incrementTime() {
		units = units + 1;
		
		if (units == 10) { //A
			units = 0;
			
			tens = tens + 1;
			
			if (tens == 6) { //B
				tens = 0;
				hour = hour + 1;
			
				if (hour == 13) { //C
		
					hour = 1;
				
				}//END C
			
			}//END B
		
		}//END C
	
	} //END incrementsTime
	
	/**
	 * This function checks if the current time is intervaled. This means, is the difference
	 * between each number equal. 
	 * 
	 * Watch: You have to account for two cases
	 * 			Case 1: four digits.
	 * 			Case 2: three digits.
	 * 
	 * Notice that we have again leveraged the mod operator and integer division to deal with the 
	 * hour time. 
	 * 
	 * Good Practice:    If your function returns a boolean it is good to start it with the word
	 * 					"is" or "has"
	 * @return
	 */
	public boolean isIntervaled() {
		
		if (hour/10 != 0) 
			return hour%10 - hour/10 == tens - hour%10 && tens - hour%10 == units - tens;
		
		return tens - hour%10 == units - tens;
		 
	}
	
	
	/**
	 * This is the toString method.  It is a VERY SPECIAL METHOD that is automatically called
	 * when you try and print out an object to the screen.  
	 * 
	 * TRY IT:  Comment out this method and then run the program. What do you notice?
	 * 
	 * The green arrow on the left (in eclipse) indicated that it is an OVERRIDDEN method.  This means
	 * that a version of this method already exists somewhere in the hierarchy, but since we have written 
	 * our own it OVERRIDES the other one. 
	 * 
	 */
	public String toString() {
		return hour+":"+tens+""+units;
	}

	/**
	 * This is the main method.  Usually we would want to pull this out of the class.  By keeping it in the class we 
	 * run the risk of not fully appreciating encapsulation, that is having private variables and what that means.  If 
	 * you were to take this approach for this contest problem, which could be considered overkill, you would have to put
	 * the main method in here to contain everything in one file. 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//The below line creates a Time object.  We say that t has a Time reference and a Time object. 
		//At this point reference type and object type will always match, but that will change so get 
		//used to using these terms.
		Time t = new Time(12,00);
		int ctr = 0; //counts the number of intervaled times found
		for (int i =0; i < 180; i++) {
			
			//The below line called the incrementTime function.  We know that increment time is a 
			//NON-STATIC method (called an instance method) because it has been called with an object t.  
			//Whatever object calls the instance method is considered the IMPLIED OBJECT.  This means that
			//when you read the code of the method any fields the function refers to is in reference to 
			//the implied object. 
			//
			//	Time time1 = new Time(12,01); //creates a time object with time 12:01
			//	Time time2 = new Time(1,45); //creates a time object with time 1:45
			//
			//	time1.incrementTime(); //increments time1 object to 12:02
			//  time2.incrementTime(); //increments time2 object to 1:46
			//
			t.incrementTime();
			
			//The below line prints out the time object.  Notice that it doesn't print out the memory reference.
			//This is because we have a built in method called toString().  The toString method is VERY SPECIAL
			//method that you will familiarize yourself with.  Try commenting out the toStirng method and then
			//run the code.  Notice that what happens is output is now the memory reference.
			System.out.println(t);
			
			//Technique: Since isIntervaled returns a boolean we can place it directly in the conditional structure
			//I print out a bunch of astriks to be able to visually identify when function is called. 
			//Notice that we are calling isIntervaled using the implied object t. 
			if (t.isIntervaled()) {
				System.out.println("****************************");
				ctr = ctr + 1;
			}
		}
		System.out.println(ctr);
		
	}
}//end class
