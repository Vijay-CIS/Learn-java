public class SubscriberManager {
    public static void main(String[] args) {

        long aadhar = 425539073922L;
        String firstName = "Vijay";
        String lastName = "S";
        String addressLine1 = "10 Wood Street";
        String addressLine2 = "Bell Country";
        String town = "Yorkshire";
        int pincode = 631007;
        long mobileNumber = 9500373830L;
        String[] documentLinks = { "aadhar-link", "Voter-id-link" };
        displaySubscriber(aadhar, firstName, lastName, addressLine1, addressLine2, town, pincode, mobileNumber,
                documentLinks);

        aadhar = 657657658765L;
        firstName = "Smith";
        lastName = "Edward";
        addressLine1 = "14 River Bank Street";
        addressLine2 = "Denver County";
        town = "Derby";
        pincode = 8979798;
        mobileNumber = 8878978788L;
        documentLinks = new String[2];
        documentLinks[0] = "aadhar-link";
        documentLinks[1] = "voter-id-link";
        displaySubscriber(aadhar, firstName, lastName, addressLine1, addressLine2, town, pincode, mobileNumber,
                documentLinks);

    }

    public static void displaySubscriber(long aadhar, String firstName, String lastName,
            String addressLine1, String addressLine2, String town, int pincode,
            long mobileNumber, String[] documentLinks) {
        // First Subscriber
        System.out.println("Adhaar: " + aadhar);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Address: " + addressLine1 + ", " + addressLine2 + "," +
                town + "-" + pincode);
        System.out.println("Mobile Number:" + mobileNumber);
        System.out.println("Subscriber Document: ");

        for (int i = 0; i < documentLinks.length; i++) {
            System.out.println(i + 1 + "." + documentLinks[i]);
        }

        System.out.println("=============================");

    }
}