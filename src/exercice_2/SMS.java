package exercice_2;

public class SMS implements INotification{
	private String sender;

	public SMS(String sender) {
		this.sender = sender;
	}

	@Override
	public void send(String r, String m) {
		System.out.printf("[SMS] from %s To %s : %s%n", sender, r, m);
		
	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "SMS";
	}
	
	

}
