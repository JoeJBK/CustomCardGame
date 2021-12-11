package furggleFree;

import java.util.Scanner;

public class furggleMain {

	public static void main(String[] args) {
		Deck deck = new Deck(true);
		Dice dice = new Dice();

		Scanner in = new Scanner(System.in);
		int rounds = 0;

		Player player = new Player();
		Player player2 = new Player();

		while (rounds < 5) {

			System.out.println("Hit H to receive a card: ");
			String ans = in.nextLine().toLowerCase();

			if (ans.equals("h")) {

				if (!player.furggleFree()) {
					System.out.println("Player One's Current Emoji: ");
					System.out.println(player.addToHand(deck.drawCard(), dice.roll()) + "\n");

					System.out.println("Hit K to keep or P to pull again! \n");
					String str = in.nextLine().toLowerCase();

					if (str.equals("k")) {
						System.out.println("Player One: " + player.toString() + "\n");

					}

					else if (str.equals("p")) {
						player.removeEmoji();
						player.addToHand(deck.drawCard(), dice.roll());
						System.out.println("Player One: " + player.toString() + "\n");
					}
				}

				else {
					System.out.println("Player One's Current Emoji: ");
					System.out.println(player.addToHand(deck.drawCard(), dice.roll()) + "\n");

					System.out.println("Hit K to keep or P to pull again! \n");
					String str2 = in.nextLine().toLowerCase();

					if (str2.equals("k") || player.furggleFree()) {
						System.out.println("Player One: " + player.toString() + "\n");

					}

					else if (str2.equals("p")) {
						player.removeEmoji();
						player.addToHand(deck.drawCard(), dice.roll());
						System.out.println("Player One: " + player.toString() + "\n");
					}

				}

				if (!player2.furggleFree()) {
					System.out.println("Player Two's Current Emoji: ");
					System.out.println(player2.addToHand(deck.drawCard(), dice.roll()) + "\n");

					System.out.println("Hit K to keep or P to pull again! \n");
					String str = in.nextLine().toLowerCase();

					if (str.equals("k") || player2.furggleFree()) {
						System.out.println("Player Two: " + player2.toString() + "\n");

					}

					else if (str.equals("p")) {
						player2.removeEmoji();
						player2.addToHand(deck.drawCard(), dice.roll());
						System.out.println("Player Two: " + player2.toString() + "\n");
					}
				}

				else {

					System.out.println("Player Two's Current Emoji: ");
					System.out.println(player2.addToHand(deck.drawCard(), dice.roll()) + "\n");

					System.out.println("Hit K to keep or P to pull again! \n");
					String str2 = in.nextLine().toLowerCase();

					if (str2.equals("k") || player2.furggleFree()) {
						System.out.println("Player Two: " + player2.toString() + "\n");

					}

					else if (str2.equals("p")) {
						player2.removeEmoji();
						player2.addToHand(deck.drawCard(), dice.roll());
						System.out.println("Player Two: " + player2.toString() + "\n");
					}
				}

			}
			rounds++;
			System.out.print("Round: " + rounds + "\n");
		}
		System.out.println("Player One's Score: " + player.getHandTotal());
		System.out.println("Players Two's Score: " + player2.getHandTotal());
		in.close();
	}
}