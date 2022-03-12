import java.util.Scanner; // Scanner Class 

public class Test { // Class Name
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); //Getting The input From the user
        System.out.println("Kindly,Post your Reviews:"); 
        String s = input.nextLine();   //User Input
        String a = (s.replace("kill", "***").replace("murder", "***").replace("assassination", "***").replace("bad",
                "***"));        // Repalce the foul Words With ****
        System.out.println(a);  // Prints a
        String find = "***";      // Search for **** Words
        int i = a.indexOf(find); 
        if (i > 0)  // Condition
            System.out.println("it has Unparlimentary words");
        else
            System.out.println("Thanks for your Review !!");
    }
}

