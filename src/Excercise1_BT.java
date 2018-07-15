import java.util.Scanner;

public class Excercise1_BT {

	public static void main(String[] args) {
		
		//Variable declaration section
		//All variables are declared at the top of the program
		
		Scanner s = new Scanner(System.in);
		
		double area = 0;
		double r = 9;
		
		double volume = 0;
		double h = 0;
		
		
		double a = 0;
		double b = 0;
		double angleC = 0;
		double c = 0;
				
		//Calculation 1:
		System.out.println("Calculation1 1: Area of a Circle");
		
		System.out.println("Input radius of circle: "); //Step 1: Prompt for input
		r = s.nextDouble(); //Step 2: Take input
		
		
		//By changing 22 to 22.0 the program assumes 22.0 is a double and does normal division.
		area = (Math.PI)*r*r;
		
		System.out.println("A circle with radius "+r+" has an area "+area);
		
		//Calculation 2:
		System.out.println("Calculation 2: Volume of a Cylinder");
		
		System.out.println("Input radius of circle: ");
		r = s.nextDouble();
		
		System.out.println("Input length of height: ");
		h = s.nextDouble();
		
		volume = (22.0/7)*r*r*h;
		
		System.out.println("A circle with radius "+r+" and height "+h+" has a volume "+volume);
		
		//Calculation 3:
		System.out.print("Calculation 3: Cosine Law");
		
		System.out.println("Input length of side a: ");
		a = s.nextDouble();
		
		System.out.println("Input length of side b: ");
		b = s.nextDouble();
		
		System.out.println("Input angle C in degrees: " );
		angleC = s.nextDouble();
		
		angleC = Math.toRadians(angleC);	
		
		c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(angleC));
		System.out.println("A triangle with side a "+a+", side b "+b+", and angle C "+angleC+" has side c " +c);
				

		
		
				
				

	}

}
