# javaprograms
//Java Programs created by Mrinal that could be useful to others 
//I created a geometry Area calculator that can figure out the area of a circle , 
// rectangle, square, trapezoid, ellipse, or parallelogram

import java.util.*; 
import java.lang.*; 
import java.util.Scanner ; 

public class geometryArea{
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); 	
		System.out.print("This is a geometry calculator\n");
		System.out.println("What plane shape you like to find the area of?\n ");
		System.out.print(" 1. Circle\n 2. Rectangle \n 3. Square \n 4. Trapezoid \n 5. Ellipse \n 6. parallelogram  \n ");
		System.out.print("Please enter an integer\n");
		while(!input.hasNextInt()) 
		{
			System.out.println("Enter an integer between 1 and 6 please: ");
		    input.next();	 
		}
		int z = input.nextInt(); 	
		if (z < 0 || z >= 7) {
		    System.out.println("Enter an integer between 1 and 6 please: ");
			input.next();  
		}
		
		switch (z) {
		case 1: circ(); break; 
		case 2: rec(); break; 
		case 3: sq(); break; 
		case 4: trap(); break; 
		case 5: ell(); break; 
		case 6: parr(); break; 
		default: System.out.println("Please enter an integer between 1-6: ");
		input.nextInt(); 
		break;
		}
		}
	
	   
	public static void circ() {
		Scanner circ = new Scanner(System.in); 
		double x = Math.PI; 
		System.out.println("Please input radius");
		while(!circ.hasNextDouble()) 
		{
		    circ.next();
		    System.out.println("Enter an number please: ");
		}
		double r = circ.nextDouble(); 
	    if (r < 0) {
	    	 System.out.println("Enter an number please: ");
	    	 circ.next();
	    }
		System.out.println("Area of Circle = " + (r * r * x) ); 
		
	}
	public static void rec() {
		Scanner rec = new Scanner(System.in); 
		System.out.println("Please input length");
		while(!rec.hasNextDouble()) 
		{
		    rec.next();
		    System.out.println("Enter an number please: ");
		}
		double l = rec.nextDouble(); 
		System.out.println("Please input width");
		double w = rec.nextDouble();
		System.out.println("Area of Rectangle = " + (l*w) ); 
	}
	public static void sq() {
		Scanner sq = new Scanner(System.in); 
		System.out.println("Please input length");
		while(!sq.hasNextDouble()) 
		{
		    sq.next();
		    System.out.println("Enter an number please: ");
		}
		double l = sq.nextDouble(); 
		System.out.println("Area of Square = " + (l*l) );
	}
	public static void trap() {
		Scanner trap = new Scanner(System.in); 
		System.out.println("Please input vertical height (altitude)");
		double h = trap.nextDouble(); 
		while(!trap.hasNextDouble()) 
		{
		    trap.next();
		    System.out.println("Enter an number please: ");
		}
		System.out.println("Please input top base");
		double b1 = trap.nextDouble();
		System.out.println("Please input bottom base");
		double b2 = trap.nextDouble(); 
		System.out.println("Area of trapeziod is: " + ((0.5 * (b1 + b2)) * h));
	}
	public static void ell() {
		Scanner ell = new Scanner(System.in); 
		System.out.println("Please input the semi-major axes: ");
		while(!ell.hasNextDouble()) 
		{
		    ell.next();
		    System.out.println("Enter an number please: ");
		}
		double a = ell.nextDouble(); 
		System.out.println("Please input the semi-minor axes: ");
		double b = ell.nextDouble(); 
		System.out.println("The area of ellipse is : " + (Math.PI*a*b));
	}
	public static void parr() {
		Scanner parr = new Scanner(System.in); 
		System.out.println("Please input base");
		while(!parr.hasNextDouble()) 
		{
		    parr.next();
		    System.out.println("Enter an number please: ");
		}
		double b = parr.nextDouble(); 
		System.out.println("Please input vertical height (altitude)");
		double h = parr.nextDouble();
		System.out.println("Area of Parallelogram = " + (b*h) ); 
	}

}

