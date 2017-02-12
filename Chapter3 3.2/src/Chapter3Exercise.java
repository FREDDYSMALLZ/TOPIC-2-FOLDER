import java.util.Scanner;
public class Chapter3Exercise {

	public static void main(String[] args) {
		// Game, adding three numbers
		
		int number1 = (int) (System.currentTimeMillis() % 10);//generates number1
		  int number2 = (int) (System.currentTimeMillis() * 7 % 10);//generates number2
		  int number3 = (int) (System.currentTimeMillis() * 13 % 10);//generates number3
		  
		  // Creating  a Scanner
		  Scanner input = new Scanner(System.in);
		 
		  System.out.print("What is " + number1 + " + " + number2 + " + "
		    + number3 + "? "); // Showing the question
		 
		  int answer = input.nextInt();
		 
		  System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer
		    + " is " + (number1 + number2 + number3 == answer)); // Display results

	}

}
