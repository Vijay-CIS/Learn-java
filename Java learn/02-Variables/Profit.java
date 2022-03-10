import java.util.Scanner;

public class Profit{
  public static void main(String args[]){
	  
	  Scanner input  = new Scanner(System.in);
	  System.out.println("Enter the price of the Grapes:");
	  int price = input.nextInt();
	  System.out.println("Selling Price of Grapes");
	  int sellPrice = input.nextInt();
	  
	  if(sellPrice > price) {
		  System.out.println("Profit" +" "+ (sellPrice-price));
		  
	  }
	  else{
		  System.out.println("Loss" +" "+ (price-sellPrice));
	  }
	 
	}
}

