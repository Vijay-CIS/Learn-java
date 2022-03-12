public class Subscriber {
    public static void main(String[] args) {

    private long aadhar;
    private String firstName;
    private String lastName;
    private String addressLine1;
    private String addressLine2;
    private String town;
    private int pincode;
    private long mobileNumber;
    private String[] documentLinks;

    public Subscriber(long aadhar, String firstName, String lastName, String addressLine1,
            String addressLine2, String town, int pincode, long mobileNumber,
            String[] documentLinks) {
        this.aadhar = aadhar;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.town = town;
        this.pincode = pincode;
        this.mobileNumber = mobileNumber;
        this.documentLinks = documentLinks;
    }

    public void displaySubscriber() {
        System.out.println("Aadhar: " + aadhar);
        System.out.println("Name: " + firstName + ", " + lastName);
        System.out.println("Address: " + addressLine1 + ", " +
                addressLine2 + ", " + town + " - " + pincode);
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Subscriber Documents: ");
        for (int i = 0; i < documentLinks.length; i++) {
            System.out.println(i + 1 + ". " + documentLinks[i]);
        }
        System.out.println("======================");

    }

    public static void main(String args[]) {
        String[] documentLinks = { "aadhar-link", "voter-id-link" };
        Subscriber subscriber1 = new Subscriber(76587687678L, "John", "Edward", "10 Wood Street",
                "Bell County", "Yorkshire", 8768768, 9876543210L, documentLinks);
        subscriber1.displaySubscriber();
    }
}