package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CardTester
{

	@Test
	public void test()
	{
		//It was a struggle finding a card number that wasn't an active card to test....
		//I am on to you professor, getting students to in put credit card numbers!!!
		
		String validCardNumber = "1234567890123452";
		String invalidCardNumber = "1234567890123459";
		CreditCard trueCard = new CreditCard(validCardNumber);
		CreditCard falseCard = new CreditCard(invalidCardNumber);
		assertTrue("This should retun true", trueCard.isValid());
		assertFalse("This should return false", falseCard.isValid());
	}

}
