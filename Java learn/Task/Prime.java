import java.util.Scanner;

public class Prime{
	public static void main(String[] args){
		Scanner ip =  new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = ip.nextInt();
		int b = a/2;
		boolean check= false;
		if (a==0 || a==1){
			System.out.println(a+" is not a prime number.");
		}
		for (int i=2; i<b;i++){
			if (a%i==0){
				check=true;
			}
		}
		if(check){
			System.out.println(a+" is not a prime number.");
		}
		else{
			System.out.println(a+" is a prime number.");
		}
	}
}
		
		