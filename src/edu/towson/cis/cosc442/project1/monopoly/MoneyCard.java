package edu.towson.cis.cosc442.project1.monopoly;

public class MoneyCard extends Card {
    private int amount;
    private int cardType;
    
    private String label;
    
    /**
     * Constructs a new money card instance with the specified parameters.
     *
     * @param label label
     * @param amount amount
     * @param cardType type
     */
    public MoneyCard(String label, int amount, int cardType){
        this.label = label;
        this.amount = amount;
        this.cardType = cardType;
    }

    /**
     * Applies the action.
     */
    public void applyAction() {
        Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		currentPlayer.setMoney(currentPlayer.getMoney() + amount);
    }

    /**
     * Returns the card type.
     *
     * @return the resulting numeric value
     */
    public int getCardType() {
        return cardType;
    }

    /**
     * Returns the label.
     *
     * @return the resulting string
     */
    public String getLabel() {
        return label;
    }
}
