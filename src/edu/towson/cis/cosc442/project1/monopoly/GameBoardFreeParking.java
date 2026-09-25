
package edu.towson.cis.cosc442.project1.monopoly;

public class GameBoardFreeParking extends GameBoard {
	/**
	 * Constructs a new game board free parking instance.
	 */
	public GameBoardFreeParking() {
		super();
		JailCell jail = new JailCell();
		FreeParkingCell freeParking = new FreeParkingCell();
		GoToJailCell goToJail = new GoToJailCell();
		addCell(jail);
		addCell(freeParking);
		addCell(goToJail);

	}
}
