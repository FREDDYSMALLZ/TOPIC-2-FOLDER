import java.util.Scanner;
public class Chapter9Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Algebra;QuadraticEquation
		
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a, b, c: ");
	    double a = input.nextDouble();
	    double b = input.nextDouble();
	    double c = input.nextDouble();

	    QuadraticEquation equation = new QuadraticEquation(a, b, c);
	    double discriminant = equation.getDiscriminant();

	    if (discriminant < 0) {
	      System.out.println("The equation has no roots");
	    }
	    else if (discriminant == 0)
	    {
	      System.out.println("The root is " + equation.getRoot1());// display one root
	    }
	    else //(discriminant >0)
	    {
	    	System.out.println("The roots are "+ equation.getRoot1() + " and " 
	    + equation.getRoot2());
	    }
	    
	    }  
	  }
	

	class QuadraticEquation {
	  private double a;
	  private double b;
	  private double c;

	  public QuadraticEquation(double x, double y, double z) {
	    a = x;
	    b = y;
	    c = z; 
	  }
	  
	  double getx() {
	    return a;
	  }

	  double gety() {
	    return b;
	  }

	  double getz() {
	    return c;
	  }

	  double getDiscriminant() { //Method used to returns the discriminant
	    return b * b - 4 * a * c;
	  }

	  double getRoot1() {// Method to return the root of the first equation
	    if (getDiscriminant() < 0)
	      return 0;
	    else {
	      return (-b + getDiscriminant()) / (2 * a);// root equation r1
	    }
	  }

	  double getRoot2() {//Method to return the root of the second equation
	    if (getDiscriminant() < 0)
	      return 0;
	    else {
	      return (-b - getDiscriminant()) / (2 * a);// root equation r2
	}

}
}
