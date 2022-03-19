import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Star Restaurant");
        System.out.println("Date:15-Mar-22");
        System.out.println();

        System.out.println("#   " + "Items   " + "   Qty   " + " Total");
        System.out.println("=   " + "=====   " + "   ===   " + " =====");
        int Qty;
        int sum;
        int price;
        int total = 0;
        String[] menu = new String[] { "1.  Idly", "2.  Vadai", "3.  Dosa",
                "4.  Poori", "5.  Parotta" };
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);

        }

        for (int j = 0; j <= menu.length; j++) {
            System.out.println("Enter the item");

            System.out.println(j);
            // int s = input.nextInt();
            price = 20;
            System.out.println("Enter the Quantity:");
            Qty = input.nextInt();
            sum = price * Qty;
            // System.out.println(menu[j - 1] + "\t" + sum);
            total += sum;

        }
        System.out.println(total);

    }
}
