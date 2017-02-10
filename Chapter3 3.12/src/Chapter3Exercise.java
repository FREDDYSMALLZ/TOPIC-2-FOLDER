import java.util.Scanner;
public class Chapter3Exercise {

	public static void main(String[] args) {
		// palindrome number
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter a three-digit integer:");
		  int number = input.nextInt();
		 
		  // Extracting digits
		  int first = number / 100;
		  int last = number % 10;
		  if (last == first) {
			  //Display to the console
			  // A number is palindrome if it reads from right to left and vice versa
			  
		   System.out.print(number + " is a palindrome");
		  } else {
		   System.out.print(number + " is not a palindrome");

	}

	}
}
