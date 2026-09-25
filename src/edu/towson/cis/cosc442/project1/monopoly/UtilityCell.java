package edu.towson.cis.cosc442.project1.monopoly;

public class UtilityCell extends Cell {

	public static final String COLOR_GROUP = "UTILITY";
	private static int PRICE;

	/**
	 * Sets the price.
	 *
	 * @param price price
	 */
	public static void setPrice(int price) {
		UtilityCell.PRICE = price;
	}

	/**
	 * Returns the price.
	 *
	 * @return the resulting numeric value
	 */
	public int getPrice() {
		return UtilityCell.PRICE;
	}

	/**
	 * Returns the rent.
	 *
	 * @param diceRoll dice roll
	 * @return the resulting numeric value
	 */
	public int getRent(int diceRoll) {
		if(theOwner.numberOfUtil() == 1) {
			return diceRoll * 4;
		} else if (theOwner.numberOfUtil() >= 2) {
			return diceRoll * 10;
		}
		return 0;
	}

	/**
	 * Play actions.
	 */
	public void playAction() {
		Player currentPlayer = null;
		if(!isAvailable()) {
			currentPlayer = GameMaster.instance().getCurrentPlayer();
			if(theOwner != currentPlayer) {
				GameMaster.instance().utilRollDice();
				int diceRoll = GameMaster.instance().getUtilDiceRoll();
				currentPlayer.payRentTo(theOwner, getRent(diceRoll));
			}
		}
	}
}
