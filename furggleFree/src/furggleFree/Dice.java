package furggleFree;

public class Dice {

	private final int sides = 3;
	private int value;

	public Dice() {
		this.value = 1;
	}

	public Dice(int value) {
		this.value = value;
	}

	public int roll() {
		value = (int) (Math.random() * sides) + 1;

		return value;
	}

	public int getValue() {
		return value;
	}
}