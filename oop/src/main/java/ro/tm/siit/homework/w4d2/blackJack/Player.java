package ro.tm.siit.homework.w4d2.blackJack;

/**
 * the class Player implements a player of blackjack
 * 
 * @author Ciprian_Foia
 * @since 2015.12.21
 */
public class Player {
	private String name; // the name of the player
	private Card[] hand = new Card[52]; // the hand of the player
	private int numberOfCards; // the number of card in hand

	/**
	 * Constructor
	 * 
	 * @param oneName
	 *            defines the name of the player
	 */
	public Player(String oneName) {
		this.name = oneName;
	}

	/**
	 * the addCard method adds a card to the player hand
	 * 
	 * @param oneCard
	 *            define the card that adds
	 * @return the sum of the player's hand
	 */
	public int addCard(Card oneCard) {
		this.hand[this.numberOfCards] = oneCard;
		this.numberOfCards++;

		return (this.calculateHandSum());
	}

	/**
	 * the calculateHandSum gets the sum of the cards in player's hand
	 * 
	 * @return the sum of cards
	 */
	public int calculateHandSum() {
		int handSum = 0;
		int cardNum;
		for (int c = 0; c < this.numberOfCards; c++) {
			cardNum = this.hand[c].getNumber();
			if (cardNum == 1) { // the value of ace
				handSum += 11;
			} else if (cardNum > 10) { // the value of jack,queen/king
				handSum += 10;
			} else {
				handSum += cardNum;
			}
		}
		return handSum;
	}

	/**
	 * the printHand method prints the player's cards from his hand
	 */
	public void printHand() {
		System.out.println(this.name + " cards");
		for (int c = 0; c < this.numberOfCards; c++) {
			System.out.println(this.hand[c].toString());
		}

	}

}
