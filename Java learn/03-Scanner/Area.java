import java.util.Scanner;
import java.lang.Math;

public class Area{
  public static void main(String args[]){
	  
	  Scanner input  = new Scanner(System.in);
	  System.out.println("Enter the area of the circle");
	  int r = input.nextInt();
	  double pi = 3.14;
	  double area = pi*r*r;
	  System.out.println(area);
	 
	}
}