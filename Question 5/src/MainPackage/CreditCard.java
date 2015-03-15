package MainPackage;

import java.util.Scanner;

import javafx.scene.shape.ClosePath;

public class CreditCard
{
	private String	cardNumber;

	public String getCardNumber()
	{
		return cardNumber;
	}

	public void setCardNumber(String cardNumber)
	{
		this.cardNumber = cardNumber;
	}

	public CreditCard(String cardNumber)
	{
		this.cardNumber = cardNumber;
	}

	public CreditCard()
	{
		this("0000000000000000");
	}

	public boolean isValid()
	{
		int sum = 0;
		for (int i = 0; i < 15; i++) {
			int digit = (int) (this.cardNumber.charAt(i) - 48);
			if (i % 2 == 0) {
				if (digit * 2 > 9) {
					switch (digit)
					{
					case 5:
						digit = 1;
						break;
					case 6:
						digit = 3;
						break;
					case 7:
						digit = 5;
						break;
					case 8:
						digit = 7;
						break;
					case 9:
						break;
					}
					sum += digit;
				} else
					sum += digit * 2;
			} else
				sum += digit;
		}

		return (((sum + (this.cardNumber.charAt(15) - 48)) % 10) == 0);
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 16 digit card number, no spaces :");
		String cardNumber = input.next();
		CreditCard card = new CreditCard(cardNumber);
		System.out.println("This card number is " + card.isValid());
		input.close();
	}
}
