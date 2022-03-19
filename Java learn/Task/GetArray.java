import java.util.Scanner;

public class GetArray {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = input.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Array elements are: ");

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
