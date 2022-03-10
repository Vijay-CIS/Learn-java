import java.util.Scanner;
public class If{
  public static void main(String args[]){
	
	 Scanner input = new Scanner (System.in);
	 System.out.println("Enter the age:");
	 int age = input.nextInt();
	 
	 if(age =>18 && age == 18){
	 System.out.println("Can Vote");
	 }
	 
	 else{
		 System.out.println("Cannot Vote");
	 }
  }
}
