public static void main(String[] args) {
		// Follows an example of the circle class
		//Also follows an example of the Account class
		
		Stock stock = new Stock("ORCL", "Oracle Corporation");//Stock symbol and name
	      stock.setPreviousClosingPrice(34.5);//sets the previous closing price

	      stock.setCurrentPrice(34.35);//sets the current price
	      
	      // Display stock info
	      
System.out.println("Previous Closing Price: " + stock.getPreviousClosingPrice());
System.out.println("Current Price: " + stock.getCurrentPrice());
System.out.println("Price Change: " + stock.getChangePercent() * 100 + "%");

	    }
	  }

	class Stock {
	  String symbol;//Displays the stock symbol	
	  String name;//Name of the stock
	  double previousClosingPrice;//stock price for the previous day
	  double currentPrice;//stock price for the current time

	  public Stock() {
	  }

	  public Stock(String newSymbol, String newName) {
	    symbol = newSymbol;
	    name = newName;
	  }

	  public double getChangePercent() {
	    return (currentPrice - previousClosingPrice) /
	      previousClosingPrice;
	  }
	  
	  public double getPreviousClosingPrice() {
	    return previousClosingPrice;
	  }
	  
	  public double getCurrentPrice() {
	    return currentPrice;
	  }
	  
	  public void setCurrentPrice(double newCurrentPrice) {
	    currentPrice = newCurrentPrice;
	  }
	  
	  public void setPreviousClosingPrice(double newPreviousClosingPrice) {
	    previousClosingPrice = newPreviousClosingPrice;
	  }
	
	}




