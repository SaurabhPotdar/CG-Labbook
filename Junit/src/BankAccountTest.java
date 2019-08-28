import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testDeposit() {
		BankAccount account = new BankAccount("Saurabh", "Potdar", 100000);
		double salary = account.deposit(10000);
		assertEquals(110000, salary,0);
	}

	@Test
	void testWithdraw() {
		fail("Not yet implemented");
	}

}
