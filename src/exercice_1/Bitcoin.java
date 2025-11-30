package exercice_1;

public class Bitcoin implements IPaymentMethod {
	private String wallet;
	private double balance;

	public Bitcoin(String wallet, double balance) {
		this.wallet = wallet;
		this.balance = balance;
	}

	@Override
	public boolean pay(double amount) {
		double convertedAmount = amount / 91458.15;
		if (convertedAmount <= balance) {
			balance -= convertedAmount;
			System.out.printf("Bitcoin (%s) : payé %.4f BTC, reste %.4f%n", wallet, convertedAmount, balance);
			return true;
		}
		System.out.printf("Bitcoin (%s) : fond insuffisant (%.4f)<%.4f>%n", wallet, convertedAmount, balance);
		return false;
	}

	@Override
	public boolean refund(double amount) {
		double convertedAmount = amount / 91458.15;
		balance += convertedAmount;
		System.out.printf("Bitcoin (%s) : remboursé %.4f BTC, solde %.4f%n", wallet, convertedAmount, balance);
		return true;
	}

	@Override
	public String getName() {
		return "Bitcoin: " + wallet;
	}

}
