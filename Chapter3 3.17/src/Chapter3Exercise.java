import java.util.Scanner;
public class Chapter3Exercise {

	public static void main(String[] args) {
		// Game, Scissor, rock, paper
 
		System.out.print("scissor (0), rock (1), paper (2):");
		
		Scanner input = new Scanner(System.in);
		  int guess = input.nextInt();
		  int computer = (int) (Math.random() * 3);
		  String strComputer = "";
		 
		  switch (computer) {
		  case 0:
		   strComputer = "scissor";
		   break;
		  case 1:
		   strComputer = "rock";
		   break;
		  case 2:
		   strComputer = "paper";
		   break;
		  }
		 
		  String strGuess = "";
		  switch (guess) {
		  case 0:
		   strGuess = "scissor";
		   break;
		  case 1:
		   strGuess = "rock";
		   break;
		  case 2:
		   strGuess = "paper";
		   break;
		  default:
		   System.out.print("Invalid input.");
		   System.exit(0);
		  }
		 // Display to the console
		  
		  System.out.print("The computer is " + strComputer + ". You are "
		    + strGuess);
		 
		  if (computer == guess) {
		   System.out.print(" too. It is a draw");
		  } else if (computer - guess == 1 || computer - guess == -2) {
		   System.out.print(". Computer won.");
		  } else if (computer - guess == -1 || computer - guess == 2) {
		   System.out.print(". You won.");
	}

	}
}
