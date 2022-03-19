public class _EvenOrOdd {
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 7, 9, 3 };
        System.out.println("Even Numbers");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Odd Numbers");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }

    }

}
