package ro.tm.siit.homework.w4d2.blackJack;

import java.util.Scanner;

/**
 * the GamePlay class implements the gamePlay of blackjack game
 * 
 * @author Ciprian_Foia
 * @since 2015.12.21
 */
public class GamePlay {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Deck deck = new Deck(true);
		Player player1 = new Player("Ciprian"); // player1 object
		Player player2 = new Player("Dealer"); // player2(dealer)object

		player1.addCard(deck.dealNextCard());
		player2.addCard(deck.dealNextCard());
		player1.addCard(deck.dealNextCard());
		player2.addCard(deck.dealNextCard());
		player1.printHand();
		System.out.println("");
		player2.printHand();
		System.out.println("");

		if (player1.calculateHandSum() == 21 && player2.calculateHandSum() != 21) {
			System.out.println("You win");
		} else if (player1.calculateHandSum() != 21 && player2.calculateHandSum() == 21) {
			System.out.println("Dealer wins");
		}
		System.out.println("Draw card or stop?      ---->(type draw or stop)");
		String choice = input.nextLine();
		if (choice.equals("draw")) {
			player1.addCard(deck.dealNextCard());
			player1.calculateHandSum();
			player1.printHand();
			if (player1.calculateHandSum() > 21) {
				System.out.println("You bust.  Dealer wins");
			}
		}
		while (choice.equals("stop")) {
			player1.printHand();
			player1.calculateHandSum();
			System.out.println("");
			while (player2.calculateHandSum() < 17) {
				System.out.println("Dealer draws a card");
				player2.addCard(deck.dealNextCard());
				if (player2.calculateHandSum() > 21) {
					System.out.println("Dealer bust .You win");
				}
				break;
			}
			player2.printHand();
			player2.calculateHandSum();
			int player1Sum = player1.calculateHandSum();
			int player2Sum = player2.calculateHandSum();
			if (player1Sum > player2Sum && player1Sum <= 21 || player2Sum > 21) {
				System.out.println("You win");
			} else {
				System.out.println("Dealer wins");
			}
			break;
		}

	}

}
