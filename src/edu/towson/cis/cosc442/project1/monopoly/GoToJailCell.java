package edu.towson.cis.cosc442.project1.monopoly;

public class GoToJailCell extends Cell {
	
	/**
	 * Constructs a new go to jail cell instance.
	 */
	public GoToJailCell() {
		setName("Go to Jail");
	}

	/**
	 * Play actions.
	 */
	public void playAction() {
		Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		GameMaster.instance().getGameBoard().queryCell("Jail");
		GameMaster.instance().sendToJail(currentPlayer);
	}
}
