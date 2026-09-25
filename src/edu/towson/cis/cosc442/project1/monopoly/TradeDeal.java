package edu.towson.cis.cosc442.project1.monopoly;

public class TradeDeal {
    private int amount;
    private int playerIndex;
    private String propertyName;

    /**
     * Returns the amount.
     *
     * @return the resulting numeric value
     */
    public int getAmount() {
        return amount;
    }
    
    /**
     * Returns the player index.
     *
     * @return the resulting numeric value
     */
    public int getPlayerIndex() {
        return playerIndex;
    }
    
    /**
     * Returns the property name.
     *
     * @return the resulting string
     */
    public String getPropertyName() {
        return propertyName;
    }
    
    /**
     * Make messages.
     *
     * @return the resulting string
     */
    public String makeMessage() {
        String message = GameMaster.instance().getCurrentPlayer() + 
        	" wishes to purchase " +
        	propertyName + " from " + 
        	GameMaster.instance().getPlayer(playerIndex) +
        	" for " + amount + ".  " + 
        	GameMaster.instance().getPlayer(playerIndex) +
        	", do you wish to trade your property?";
        return message;
    }
    
    /**
     * Sets the amount.
     *
     * @param amount amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    /**
     * Sets the property name.
     *
     * @param propertyName name
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
    
    /**
     * Sets the seller index.
     *
     * @param playerIndex zero-based index
     */
    public void setSellerIndex(int playerIndex) {
        this.playerIndex = playerIndex;
    }
}
