public class User {
    public static void signup() throws EmailAlreadyExistsException {
        boolean emailAlreadyExists = false;
        String email = "xyz@email.com";
        if (emailAlreadyExists) {
            throw new EmailAlreadyExistsException(email);
        } else {
            System.out.println("Signed up successfully.");
        }
    }

    public static void main(String args[]) {

        try {
            User.signup();

        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("After Catch");

    }
}
