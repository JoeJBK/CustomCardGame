package furggleFree;

public enum diceNumbers {
	
	One(1), Two(2), Three(3);

	private final int value;
	
	diceNumbers(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
