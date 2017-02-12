import java.util.Scanner;
public class Chapter3Exercise {

	public static void main(String[] args) {
		// Algebraic linear equation. Solving a 2 by 2 equation
		// Using cramer's rule from exercise 1.13
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter a, b, c, d, e, f:");
		  double a = input.nextDouble();
		  double b = input.nextDouble();
		  double c = input.nextDouble();
		  double d = input.nextDouble();
		  double e = input.nextDouble();
		  double f = input.nextDouble();
		   
		 // Display to the console if the equation has no solution
		
		  if (a * d - b * c == 0) {
		   System.out.println("The equation has no solution.");
		   
		  }
		  
		 // Using cramer's rule
		  
		  double x = (e * d - b * f) / (a * d - b * c);
		  double y = (a * f - e * c) / (a * d - b * c);
		  
		 //Display solution to the console
		  
		  System.out.print("x is " + x);
		  System.out.println(" and y is " + y);


	}

}
