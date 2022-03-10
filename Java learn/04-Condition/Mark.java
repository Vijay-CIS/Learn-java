import java.util.Scanner;
public class Mark {
  public static void main(String[] args) {


     Scanner input = new Scanner (System.in);
	 System.out.println("Enter the Number");
    int number = input.nextInt();
	 String size;
    switch (number) {

      case 25:
        size = "Fail";
        break;

      case 50:
        size = "Pass";
        break;

      case 75:
        size = "Average";
        break;

      case 100:
        size = "Excellent";
        break;
      
      default:
        size = "Unknown";
        break;

    }
    System.out.println("Size: " + size);
  }
}