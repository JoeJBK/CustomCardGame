package furggleFree;

import java.util.ArrayList;

public class Player {
	
	double handTotal;
	private ArrayList<String> emojis = new ArrayList<String>();
	private ArrayList<Integer> handVal = new ArrayList<Integer>();

	public Player() {
		super();

	}

	public String addToHand(Card card, int roll) {

		if (roll == 1) {
			if (card.getSuit() == Suit.Hearts) {
				emojis.add("Smiley");
				handVal.add(card.getFace().getValue());
				return ("Emoji: Smiley, " + "Value: " + card.getFace().getValue());
			}

			if (card.getSuit() == Suit.Clubs) {
				emojis.add("Harpsicord");
				handVal.add(card.getFace().getValue());
				return ("Emoji: Harpsicord, " + "Value: " + card.getFace().getValue());
			}

			if (card.getSuit() == Suit.Diamonds) {
				emojis.add("Dogfish");
				handVal.add(card.getFace().getValue());
				return ("Emoji: Dogfish, " + "Value: " + card.getFace().getValue());
			}

			if (card.getSuit() == Suit.Spades) {
				emojis.add("Tasty Cake");
				handVal.add(card.getFace().getValue());
				return ("Emoji: Tasty Cake, " + "Value: " + card.getFace().getValue());
			}
		}

		else if (roll == 2) {
			if (card.getSuit() == Suit.Hearts) {
				emojis.add("Blue Tuna");
				handVal.add(card.getFace().getValue());
				return ("Emoji: Blue Tuna, " + "Value: " + card.getFace().getValue());
			}

			if (card.getSuit() == Suit.Clubs) {
				emojis.add("Smiley");
				handVal.add(card.getFace().getValue());
				return ("Emoji: Smiley, " + "Value: " + card.getFace().getValue());
			}

			if (card.getSuit() == Suit.Diamonds) {
				emojis.add("Double Aardvark");
				handVal.add(card.getFace().getValue());
				return ("Emoji: Double Aardvark, " + "Value: " + card.getFace().getValue());
			}

			if (card.getSuit() == Suit.Spades) {
				emojis.add("Smiley");
				handVal.add(card.getFace().getValue());
				return ("Emoji: Smiley, " + "Value: " + card.getFace().getValue());
			}
		}

		else if (roll == 3) {
			if (card.getSuit() == Suit.Hearts) {
				emojis.add("Ernie");
				handVal.add(card.getFace().getValue());
				return ("Emoji: Ernie, " + "Value: " + card.getFace().getValue());
			}

			if (card.getSuit() == Suit.Clubs) {
				emojis.add("Furggle");
				handVal.add(card.getFace().getValue());
				return ("Emoji: Furggle, " + "Value: " + card.getFace().getValue());
			}

			if (card.getSuit() == Suit.Diamonds) {
				emojis.add("Smiley");
				handVal.add(card.getFace().getValue());
				return ("Emoji: Smiley, " + "Value: " + card.getFace().getValue());
			}

			if (card.getSuit() == Suit.Spades) {
				emojis.add("Swamp Thing");
				handVal.add(card.getFace().getValue());
				return ("Emoji: Swamp Thing, " + "Value: " + card.getFace().getValue());
			}
		}
		return " ";
	}

	public void getHandScore() {

		if (cakeLoss()) {
			int val = 0;

			for (int i = 0; i < emojis.size(); i++) {
				val = emojis.indexOf("Tasty Cake");
			}

			int score = handVal.get(val);

			handTotal = handTotal - score;
		}

		if (tripsUp()) {
			handTotal = handTotal * 2;
		}

		if (doubleDown()) {
			handTotal = handTotal / 2;
		}

		if (sootheBeast()) {
			handTotal = handTotal + 15;
		}

		if (fishFight()) {
			handTotal = handTotal - 10;
		}

		if (quadVark()) {
			handTotal = handTotal * 4;
		}

	}

	public boolean furggleFree() {
		boolean furggle = false;
		for (String emoj : emojis) {
			if (emoj.equals("Furggle")) {
				furggle = true;
			}
		}
		return furggle;

	}

	public boolean cakeLoss() {
		boolean ernie = false;
		boolean cake = false;

		for (String emoj : emojis) {
			if (emoj.equals("Ernie")) {
				ernie = true;
			}

			if (emoj.equals("Tasty Cake")) {
				cake = true;
			}
		}
		return ernie && cake;
	}

	public boolean doubleDown() {
		int count = 0;
		for (String emoj : emojis) {
			if (emoj.equals("Smiley")) {
				count++;
			}
		}

		if (count == 2) {
			return true;
		}
		return false;
	}

	public boolean tripsUp() {
		int count = 0;
		for (String emoj : emojis) {
			if (emoj.equals("Smiley")) {
				count++;
			}

			if (count == 3) {
				return true;
			}
		}
		return false;
	}

	public boolean sootheBeast() {
		for (int i = 0; i < emojis.size() - 1; i++) {
			if (emojis.get(i).equals("Harpsicord") && emojis.get(i + 1).equals("Swamp thing")) {
				return true;
			}
		}
		return false;
	}

	public boolean fishFight() {
		boolean dogfish = false;
		boolean tuna = false;

		for (String emoj : emojis) {
			if (emoj.equals("Dogfish")) {
				dogfish = true;
			}

			if (emoj.equals("Blue Tuna")) {
				tuna = true;
			}
		}
		return dogfish && tuna;
	}

	public boolean quadVark() {
		int count = 0;
		for (String emoj : emojis) {
			if (emoj.equals("Double Aardvark")) {
				count++;
			}
			if (count == 2) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Hand =" + emojis + " = " + handVal;
	}

	public double getHandTotal() {
		 handTotal = 0;

		for(int i = 0; i < handVal.size(); i++) {
			handTotal += handVal.get(i);
		}
		
		getHandScore();
		return this.handTotal;
	}

	public void setScore(double score) {
		this.handTotal = score;
	}

	public void removeEmoji() {
		int val = handVal.indexOf(handVal.size() - 1);
		handTotal = handTotal - val;

		emojis.remove(emojis.size() - 1);
		handVal.remove(handVal.size() - 1);

	}
}

//"Smiley", "Dogfish", "Harpsicord", "TastyCake", "Blue Tuna", "Double Aardvark",
//"Ernie", "Furggle", "Swarmp Thing" 