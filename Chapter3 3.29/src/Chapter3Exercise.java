import java.util.Scanner;
public class Chapter3Exercise {

	public static void main(String[] args) {
		// Geometry; two circles
		//Create a scanner
		Scanner input = new Scanner(System.in);
		 
		  System.out
		    .print("Enter circle1's center x-, y-coordinates, and radius:");
		  double x1 = input.nextDouble();
		  double y1 = input.nextDouble();
		  double r1 = input.nextDouble();
		 
	System.out
		    .print("Enter circle1's center x-, y-coordinates, and radius:");
		  double x2 = input.nextDouble();
		  double y2 = input.nextDouble();
		  double r2 = input.nextDouble();
		  
//circle2 is inside circle1 if the distance between the centers,<=r1 - r2
//circle2 overlaps circle1 if the distance between the centers,<=r1 + r2		  
		  double d = ((x2 - x1)* 2) + ((y2 - y1)* 2);
		 
		  if (d <= (r2 - r1)) {
		   if (r1 > r2) {
		    System.out.print("circle2 is inside circle1");
		   } else if (r2 > r1) {
		    System.out.print("circle1 is inside circle2");
		   } else {
		    System.out.print("circle2 is the same as circle1");
		   }
		  } else if (d < r2 + r1) {
		   System.out.print("circle2 overlaps circle1 ");
		  } else if (d >= r2 + r1) {
		   System.out.print("circle2 does not overlap circle1 ");
	  
	}

}
}
