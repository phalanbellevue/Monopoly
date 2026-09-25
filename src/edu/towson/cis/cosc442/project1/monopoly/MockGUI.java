package edu.towson.cis.cosc442.project1.monopoly;

public class MockGUI implements MonopolyGUI {
    private boolean btnDrawCardState, btnEndTurnState, btnGetOutOfJailState;
    private boolean[] btnTradeState = new boolean[2];

    /**
     * Enables the end turn btn.
     *
     * @param playerIndex zero-based index
     */
    public void enableEndTurnBtn(int playerIndex) {
    }

    /**
     * Enables the player turn.
     *
     * @param playerIndex zero-based index
     */
    public void enablePlayerTurn(int playerIndex) {
    }

    /**
     * Enables the purchase btn.
     *
     * @param playerIndex zero-based index
     */
    public void enablePurchaseBtn(int playerIndex) {
    }
	/**
	 * Returns the dice roll.
	 *
	 * @return array of ints
	 */
	public int[] getDiceRoll() {
		int roll[] = new int[2];
		roll[0] = 2;
		roll[1] = 3;
		return roll;
	}

    /**
     * Checks whether the draw card button enabled.
     *
     * @return true if the condition holds, false otherwise
     */
    public boolean isDrawCardButtonEnabled() {
        return btnDrawCardState;
    }

    /**
     * Checks whether the end turn button enabled.
     *
     * @return true if the condition holds, false otherwise
     */
    public boolean isEndTurnButtonEnabled() {
        return btnEndTurnState;
    }
	
	/**
	 * Checks whether the get out of jail button enabled.
	 *
	 * @return true if the condition holds, false otherwise
	 */
	public boolean isGetOutOfJailButtonEnabled() {
		return btnGetOutOfJailState;
	}

    /**
     * Checks whether the trade button enabled.
     *
     * @param i the i parameter
     * @return true if the condition holds, false otherwise
     */
    public boolean isTradeButtonEnabled(int i) {
        return btnTradeState[i];
    }

    /**
     * Move players.
     *
     * @param index zero-based index
     * @param from from
     * @param to the to parameter
     */
    public void movePlayer(int index, int from, int to) {
    }

    /**
     * Opens the respond dialog.
     *
     * @param deal deal
     * @return the resulting respond dialog
     */
    public RespondDialog openRespondDialog(TradeDeal deal) {
        RespondDialog dialog = new MockRespondDialog(deal);
        return dialog;
    }

    /**
     * Opens the trade dialog.
     *
     * @return the resulting trade dialog
     */
    public TradeDialog openTradeDialog() {
        TradeDialog dialog = new MockTradeDialog();
        return dialog;
    }

    /**
     * Sets the buy house enabled.
     *
     * @param b flag indicating whether b
     */
    public void setBuyHouseEnabled(boolean b) {
    }

    /**
     * Sets the draw card enabled.
     *
     * @param b flag indicating whether b
     */
    public void setDrawCardEnabled(boolean b) {
        btnDrawCardState = b;
    }

    /**
     * Sets the end turn enabled.
     *
     * @param enabled flag indicating whether the feature is enabled
     */
    public void setEndTurnEnabled(boolean enabled) {
        btnEndTurnState = enabled;
    }

    /**
     * Sets the get out of jail enabled.
     *
     * @param b flag indicating whether b
     */
    public void setGetOutOfJailEnabled(boolean b) {
    	this.btnGetOutOfJailState = b;
    }

    /**
     * Sets the purchase property enabled.
     *
     * @param enabled flag indicating whether the feature is enabled
     */
    public void setPurchasePropertyEnabled(boolean enabled) {
    }

    /**
     * Sets the roll dice enabled.
     *
     * @param b flag indicating whether b
     */
    public void setRollDiceEnabled(boolean b) {
    }

    /**
     * Sets the trade enabled.
     *
     * @param index zero-based index
     * @param b flag indicating whether b
     */
    public void setTradeEnabled(int index, boolean b) {
        this.btnTradeState[index] = b;
    }

    /**
     * Show buy house dialogs.
     *
     * @param currentPlayer current player
     */
    public void showBuyHouseDialog(Player currentPlayer) {
    }

    /**
     * Show messages.
     *
     * @param string string
     */
    public void showMessage(String string) {
    }

	/**
	 * Show util dice rolls.
	 *
	 * @return the resulting numeric value
	 */
	public int showUtilDiceRoll() {
//		int[] diceValues = GameMaster.instance().rollDice();
//		return diceValues[0] + diceValues[1];
		return 10;
	}

    /**
     * Starts the game.
     */
    public void startGame() {
    }

	/**
	 * Updates the mock gui.
	 */
	public void update() {
	}
}
