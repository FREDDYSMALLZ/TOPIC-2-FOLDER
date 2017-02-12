import java.util.Scanner;
public class Chapter3Exercise {

	public static void main(String[] args) {
		// Financial; Comparing costs;Two packages of rice
		//Create a scanner
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight and price for package 1:");
		  double w1 = input.nextDouble();
		  double p1 = input.nextDouble();
		  
		  System.out.println("Enter weight and price for package 2:");
		  double w2 = input.nextDouble();
		  double p2 = input.nextDouble();
		  double r = w2 / p2 - w1 / p1; // Get the ratio of the two packages rep. by r
		  double x = input.nextDouble(); // Gets the package two details
		 
		  if (r < 0.0) { // 
			  
		   System.out.println(" The two packages have the same price.");
	
		  }
		 
		  if (r > 0) {
		   x = "Pakage 2";
		  } else {
		   x = "Pakage 1";
		  }
		 
		  System.out.println("Package x" + has has a better price);
		 
		
		

	}

}
