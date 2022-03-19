import java.util.Scanner;

public class HalfRevString {
    public static void main(String[] args) {
        String RevString;
        RevString = "";
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String :");
        String Str = input.nextLine();

        for (int i = 0; i < Str.length(); i++) {
            ch = Str.charAt(i / 2);
            RevString = ch + RevString;
            System.out.println("Half RevString :" + RevString);

        }

    }

}
