package ExceptionHandling.CreateOwnException;

import java.io.FileNotFoundException;

/**
 * 
 * @author Yeasir Arafat Aronno
 *
 */
public class AnotherThrowDemo {

	public static void main(String[] args) {

		AnotherThrowDemo demo = new AnotherThrowDemo();
		demo.transferMoney(null, null, 0);
	}

	public void transferMoney(Account from, Account to, double moneyToTransfer) {
		if (from == null || to == null || from.getMoney() < moneyToTransfer) {
//			throw new IllegalArgumentException();
//			throw new IllegalArgumentException("Invalid arguments");
			throw new RuntimeException(new FileNotFoundException());
		}
		// and here goes money transferring logic
	}

	public void transferMoney2(Account from, Account to, double moneyToTransfer) {
		if (from == null || to == null) {
			throw new IllegalArgumentException();
		}
		if (from.getMoney() < moneyToTransfer) {
			throw new NotEnoughMoneyException();
		}
	}

}

class Account {

	private double money;

	public double getMoney() {
		return this.money;
	}

}
