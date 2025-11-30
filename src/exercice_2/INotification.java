package exercice_2;

public interface INotification {
	void send(String r, String m);
	int getPriority();
	String getType();
}
