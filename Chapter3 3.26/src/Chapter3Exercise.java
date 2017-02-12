import java.util.Scanner;
public class Chapter3Exercise {

	public static void main(String[] args) {
		//Integer tests
		Scanner input = new java.util.Scanner(System.in);

	    //Prompt the user to Enter an integer
	    System.out.print("Enter an integer: ");
	    int number = input.nextInt();
	    
//Display the findings to the console
	    System.out.println("Is " + number + " divisible by 5 and 6? " +
	      ((number % 5 == 0) && (number % 6 == 0)));

	    System.out.println("Is " + number + " divisible by 5 or 6? " +
	      ((number % 5 == 0) || (number % 6 == 0)));

	    System.out.println("Is " + number +
	      " divisible by 5 or 6, but not both? " +
	      ((number % 5 == 0) ^ (number % 6 == 0)));//Displys whether the staement is true
	}

}
