package exercice_2;

public class Main {
	public static void main(String[] args) {
		NotificationManager mgr = new NotificationManager();
		mgr.addChannel(new Email("isalma.issis@gmail.com"));
		mgr.addChannel(new SMS("+212 538729236"));
		mgr.addChannel(new PUSH("72hf33g"));
		
		mgr.broadcast("hayatelyajizi@gmailcom", "Votre commande est expédiée.");
		mgr.broadcast("+21248712476", "Veuillez vérifier votre compte");
		
	}
}
