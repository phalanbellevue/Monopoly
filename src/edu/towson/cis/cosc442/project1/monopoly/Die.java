package edu.towson.cis.cosc442.project1.monopoly;

public class Die {
	/**
	 * Returns the roll.
	 *
	 * @return the resulting numeric value
	 */
	public int getRoll() {
		return (int)(Math.random() * 6) + 1;
	}
}
