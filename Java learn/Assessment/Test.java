import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Post our Reviews Here:");
        String s = input.nextLine();
        String result[] = { "kill", "murder", "bad", "assasination" };

        for (int i = 0; i < 1; i++) {
            if (s.contains(result[i])) {
                System.out.println("Contains Unparlimentary Words :" + s);

            } else {
                System.out.println("Not Contains Unparlimentary words :" + s);
            }

        }
    }

}
