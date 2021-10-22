package com.junittesting3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	
	

		@Test
		void test() {
			
			
			BankAccount ob= new BankAccount(17000);
			assertThrows(InsufficientFundsException.class, () -> ob.withdraw(20000));
		}

	
}
