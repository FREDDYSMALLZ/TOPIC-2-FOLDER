
public class Chapter3Exercise {

	public static void main(String[] args) {
		// Selecting random month 
		int number1 = (int) (System.currentTimeMillis() % 12 + 1);
		  String month = "";
		   
		  switch(number1){
		  case 1: month =  "January"; break;
		  case 2: month =  "February"; break;
		  case 3: month =  "March"; break;
		  case 4: month =  "April"; break;
		  case 5: month =  "May"; break;
		  case 6: month =  "June"; break;
		  case 7: month =  "July"; break;
		  case 8: month =  "August"; break;
		  case 9: month =  "September"; break;
		  case 10: month = "October"; break;
		  case 11: month = "November"; break;
		  case 12: month = "December"; break;
		  }
		   
		  System.out.println(month);
		 

	}

}
