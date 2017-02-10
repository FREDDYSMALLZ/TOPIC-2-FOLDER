import java.util.Scanner;
public class Chapter3Exercise {

	public static void main(String[] args) {
		// The cost of shipping by various companies using formula on the book
		
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter the package weight
	    System.out.print("Enter package weight: ");
	    double w = input.nextDouble();
	    
	    //Display to the console the outcome using the formula
	   
	    if (w <= 1) {
	      System.out.println("The shipping cost is $3.5");
	    }
	    else if (w <= 3) {
	      System.out.println("The shipping cost is $5.5");
	    }     
	    else if (w <= 10) {
	      System.out.println("The shipping cost is $8.5");
	    }     
	    else if (w <= 20) {
	      System.out.println("The shipping cost is $10.5");
	    }     
	    else {
	      System.out.println("The package cannot be shipped");

	}

}
}
