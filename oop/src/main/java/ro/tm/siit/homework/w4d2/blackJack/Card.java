package ro.tm.siit.homework.w4d2.blackJack;

/**
 * the Card class implements a card from a deck
 * 
 * @author Ciprian_Foia
 * @since 2015.12.21
 */
public class Card {

	private int myNumber; // this card number
	private int myColor; // this card colorType

	/**
	 * Constructor
	 * 
	 * @param oneColor
	 *            the colorType of the card
	 * @param oneNumber
	 *            the number of the card
	 */
	public Card(int oneColor, int oneNumber) {
		this.myColor = oneColor;
		this.myNumber = oneNumber;
	}

	/**
	 * @return the number of the card
	 */
	public int getNumber() {
		return myNumber;
	}

	/**
	 * @return the colorType of the card
	 */
	public int getColor() {
		return myColor;
	}

	/**
	 * this method makes the association between the number and color of the
	 * card with the name of the card, and returns it
	 */
	public String toString() {
		String number = "";
		switch (this.myNumber) {
		case 1:
			number = "ace";
			break;
		case 2:
			number = "two";
			break;
		case 3:
			number = "three";
			break;
		case 4:
			number = "four";
			break;
		case 5:
			number = "five";
			break;
		case 6:
			number = "six";
			break;
		case 7:
			number = "seven";
			break;
		case 8:
			number = "eight";
			break;
		case 9:
			number = "nine";
			break;
		case 10:
			number = "ten";
			break;
		case 11:
			number = "jack";
			break;
		case 12:
			number = "queen";
			break;
		case 13:
			number = "king";
			break;
		}
		String color = "";
		switch (this.myColor) {
		case 1:
			color = "Diamond";
			break;
		case 2:
			color = "Hearts";
			break;
		case 3:
			color = "BlackHeart";
			break;
		case 4:
			color = "Clubs";
			break;
		}
		return number + " of " + color;
	}

}
