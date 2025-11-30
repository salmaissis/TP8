package exercice_2;

public class Email implements INotification{
	private String from;

	public Email(String from) {
		this.from = from;
	}

	@Override
	public void send(String recipient, String message) {
		System.out.printf("[Email] From: %s To: %s — %s%n",
	            from, recipient, message);
	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Email";
	}

}
