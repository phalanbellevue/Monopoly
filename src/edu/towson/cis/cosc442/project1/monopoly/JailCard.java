package edu.towson.cis.cosc442.project1.monopoly;


public class JailCard extends Card {
    int type;
    
    /**
     * Constructs a new jail card instance with the specified parameters.
     *
     * @param cardType type
     */
    public JailCard(int cardType) {
        type = cardType;
    }

    /**
     * Applies the action.
     */
    public void applyAction() {
        Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		GameMaster.instance().getGameBoard().queryCell("Jail");
		GameMaster.instance().sendToJail(currentPlayer);
    }

    /**
     * Returns the card type.
     *
     * @return the resulting numeric value
     */
    public int getCardType() {
        return type;
    }

    /**
     * Returns the label.
     *
     * @return the resulting string
     */
    public String getLabel() {
        return "Go to Jail immediately without collecting" +
        		" $200 when passing the GO cell";
    }
}
