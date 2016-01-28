package 
ro.tm.siit.homework.w4d2.blackJack;

import java.util.Random;

/**
 * the Deck class implements a deck of cards
 * 
 * @author Ciprian_Foia
 * @since 2015.12.21
 */
public class Deck {
	private int numCards; // the number of cards in deck
	private Card[] myCard; // the array of cards

	/**
	 * Constructor defines the deck of 52 cards
	 * 
	 * @param getRandomCards
	 *            defines that this deck would deal cards randomly
	 */
	public Deck(boolean getRandomCards) {
		this.numCards = 52;
		this.myCard = new Card[this.numCards];
		int i = 0;

		for (int c = 1; c <= 4; c++) { // creating the colors of the deck
			for (int n = 1; n <= 13; n++) { // creating the numbers of each
											// color
				this.myCard[i] = new Card(c, n);
				i++;
			}
		}
		if (getRandomCards) {
			this.getRandomCards();
		}
	}

	/**
	 * the getRandomCards method would mix the deck by giving randomly cards
	 */
	public void getRandomCards() {
		Random random = new Random();
		Card temp;
		int j;
		for (int i = 0; i < this.numCards; i++) {
			j = random.nextInt(this.numCards);
			temp = this.myCard[i];
			this.myCard[i] = this.myCard[j];
			this.myCard[j] = temp;
		}
	}

	/**
	 * the dealNextCard method deals always the first card of deck, and after
	 * each card dealt it decrements the number of cards by one.
	 * 
	 * @return the card dealt
	 */
	public Card dealNextCard() {
		Card topCard = this.myCard[0];
		for (int c = 1; c < this.numCards; c++) {
			this.myCard[c - 1] = this.myCard[c];
		}
		this.numCards--;
		return topCard;
	}

}
