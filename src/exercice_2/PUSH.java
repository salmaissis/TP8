package exercice_2;

public class PUSH implements INotification {
	private String appId;

	public PUSH(String appId) {
		this.appId = appId;
	}

	@Override
	public void send(String r, String m) {
		System.out.printf("[PUSH] %s To %s : %s%n", appId, r, m);

	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "PUSH";
	}
}
