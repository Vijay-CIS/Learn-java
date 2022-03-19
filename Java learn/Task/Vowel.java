import java.util.Scanner;
import java.lang.String;

public class Vowel {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		boolean check = false;
		System.out.println("Enter a string:");
		String a = ip.nextLine();

		String r = (a.replace("a", "*").replace("e", "*").replace("i", "*").replace("o", "*").replace("u", "*")
				.replace("A", "*").replace("E", "*").replace("I", "*").replace("O", "*").replace("U", "*"));

		System.out.println("Your string after removal of vowels:" + "'" + r + "'");

	}
}
