package furggleFree;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>();
	private int currentTop = 0;
	
	// Created Deck
	public Deck(boolean shuffle) {
		super();

		for (Suit suit : Suit.values()) {

			for (Face face : Face.values()) {

				cards.add(new Card(suit, face));
			}
		}

		if (shuffle) {
			Collections.shuffle(cards);
		}
		
		//System.out.println(cards);
	}
	
	public Card drawCard() {
		
		if(currentTop >= cards.size()) {
			
			currentTop = 0;
			Collections.shuffle(cards);
		}
		
		return cards.get(currentTop++);
	}
	
	public int cardsLeft() {
		
		return cards.size() - currentTop;
	}
	
	public int printCard(Card card) {
		return card.getFace().getValue(); 
	}

}
