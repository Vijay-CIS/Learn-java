public class ExceptionDemo {
    public static void main(String[] args) {
        int[] scores = { 10, 20, 30, 40, 50 };
        try {
            scores[4] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside Exception occurs");
        }
        System.out.println("After Setting Score");
    }
}
