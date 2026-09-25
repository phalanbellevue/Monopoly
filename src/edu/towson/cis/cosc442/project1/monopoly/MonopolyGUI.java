package edu.towson.cis.cosc442.project1.monopoly;

public interface MonopolyGUI {
	/**
	 * Enables the end turn btn.
	 *
	 * @param playerIndex zero-based index
	 */
	public void enableEndTurnBtn(int playerIndex);
	/**
	 * Enables the player turn.
	 *
	 * @param playerIndex zero-based index
	 */
	public void enablePlayerTurn(int playerIndex);
	/**
	 * Enables the purchase btn.
	 *
	 * @param playerIndex zero-based index
	 */
	public void enablePurchaseBtn(int playerIndex);
	/**
	 * Returns the dice roll.
	 *
	 * @return array of ints
	 */
	public int[] getDiceRoll();
    /**
     * Checks whether the draw card button enabled.
     *
     * @return true if the condition holds, false otherwise
     */
    public boolean isDrawCardButtonEnabled();
    /**
     * Checks whether the end turn button enabled.
     *
     * @return true if the condition holds, false otherwise
     */
    public boolean isEndTurnButtonEnabled();
	/**
	 * Checks whether the get out of jail button enabled.
	 *
	 * @return true if the condition holds, false otherwise
	 */
	public boolean isGetOutOfJailButtonEnabled();
    /**
     * Checks whether the trade button enabled.
     *
     * @param i the i parameter
     * @return true if the condition holds, false otherwise
     */
    public boolean isTradeButtonEnabled(int i);
	/**
	 * Move players.
	 *
	 * @param index zero-based index
	 * @param from from
	 * @param to the to parameter
	 */
	public void movePlayer(int index, int from, int to);
    /**
     * Opens the respond dialog.
     *
     * @param deal deal
     * @return the resulting respond dialog
     */
    public RespondDialog openRespondDialog(TradeDeal deal);
    /**
     * Opens the trade dialog.
     *
     * @return the resulting trade dialog
     */
    public TradeDialog openTradeDialog();
    /**
     * Sets the buy house enabled.
     *
     * @param b flag indicating whether b
     */
    public void setBuyHouseEnabled(boolean b);
    /**
     * Sets the draw card enabled.
     *
     * @param b flag indicating whether b
     */
    public void setDrawCardEnabled(boolean b);
    /**
     * Sets the end turn enabled.
     *
     * @param enabled flag indicating whether the feature is enabled
     */
    public void setEndTurnEnabled(boolean enabled);
    /**
     * Sets the get out of jail enabled.
     *
     * @param b flag indicating whether b
     */
    public void setGetOutOfJailEnabled(boolean b);
    /**
     * Sets the purchase property enabled.
     *
     * @param enabled flag indicating whether the feature is enabled
     */
    public void setPurchasePropertyEnabled(boolean enabled);
    /**
     * Sets the roll dice enabled.
     *
     * @param b flag indicating whether b
     */
    public void setRollDiceEnabled(boolean b);
    /**
     * Sets the trade enabled.
     *
     * @param index zero-based index
     * @param b flag indicating whether b
     */
    public void setTradeEnabled(int index, boolean b);
    /**
     * Show buy house dialogs.
     *
     * @param currentPlayer current player
     */
    public void showBuyHouseDialog(Player currentPlayer);
    /**
     * Show messages.
     *
     * @param string string
     */
    public void showMessage(String string);
	/**
	 * Show util dice rolls.
	 *
	 * @return the resulting numeric value
	 */
	public int showUtilDiceRoll();
	/**
	 * Starts the game.
	 */
	public void startGame();
	/**
	 * Updates the monopoly gui.
	 */
	public void update();
}
