public class ReverseString {
    public static void main(String[] args) {

        String str = "Hello";
        String RevString = "";
        char ch;
        System.out.println("original Word : Hello");

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            RevString = ch + RevString;
        }
        System.out.println("ReverseString : " + RevString);

    }

}
