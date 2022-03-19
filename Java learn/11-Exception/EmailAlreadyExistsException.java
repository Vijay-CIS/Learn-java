public class EmailAlreadyExistsException extends Exception {
	public EmailAlreadyExistsException(String email) {
		super("Email " + email + " already exists.");
	}
}