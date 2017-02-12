
public class Chapter9Exercise {

	public static void main(String[] args) {
		// Designing a class; Account
	        //Account Id 1122
		//Balance of $20000
		//Annual Interest rate of 4.5%
		//Deposit of $3000
		//Withdrawal of $2500
		
	Account account = new Account();
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500.0);
        account.deposit(3000.0);
        account.setBalance(20000);
        account.getDateCreated();
        account.getMonthlyInterest();
        account.getMonthlyInterestRate();
        
        System.out.println("Balance is $ "+ account.getBalance());
        System.out.println("Monthly Interest is: " + account.getMonthlyInterest());
	System.out.println(" The account was created on: " + "account.getDateCreated()");
		
		
	}

}
class Account{
	private int id = 0; //Default id account
	private double balance = 0.0; //Default account balance
	private static double annualInterestRate = 0.0; // Default annualInterestRate
	private java.util.Date dateCreated;//Date when the account was created
	
	public Account(){
		dateCreated = new java.util.Date();
	}
	
	
	

	public Account(int id , double balance, double annualInterestRate){
		id = id;
		balance = balance;
		annualInterestRate = annualInterestRate;
		
	}
		
	    public int getId() {
	        return id;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public double getAnnualInterestRate() { //Returns the annualInterestRate
	        return annualInterestRate;
	    }

	    public java.util.Date getDateCreated() { //method returns the dateCreated
	        return dateCreated;
	    }

	    public void setId(int id) {
	        id = id;
	    }

	    public void setBalance(double balance) {
	        balance = balance;
	    }

	    public void setAnnualInterestRate(double annualInterestRate) {
	        annualInterestRate = annualInterestRate;
	    }

	    public double getMonthlyInterestRate() {
	        return (annualInterestRate / 100) / 12 ; //Annual Interest Rate is a %
	    }

	    public double getMonthlyInterest() {
	        return balance * getMonthlyInterestRate();//Returns the Monthly Interest
	    }

	    public void withdraw(double amount) { //Decreases the balance
	        balance -= amount;
	    }

	    public void deposit(double amount) { //Increases the balance
	        balance += amount;
	        
	        
	    }
	

}

	
		

	
